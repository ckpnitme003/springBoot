package com.nt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nt.entity.JobSeekerInfo;
import com.nt.model.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

@Controller
public class JobSeekerController {

	@Autowired
	private IJobSeekerMgmtService service;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ServletContext sc;
	
	@GetMapping("/")
	public String showHomePage() {
		//return LVN
		return "welcome";
	}
	@GetMapping("/js_register")
	public String showFormPage(@ModelAttribute("js")JobSeeker js) {
		
		//return LVN
		return "show_regsiter";
	}
	@PostMapping("/js_register")
	public String registerJS(@ModelAttribute("js")JobSeeker js,Map<String,Object> map) throws IOException {
		
		String uploadPath=env.getProperty("upload.path");
		
		File storeFolder=new File(uploadPath);
		//check folder is avaiable in server machine or not
		if(!storeFolder.exists())
			storeFolder.mkdir();
		
		//get multipart files
		MultipartFile file1=js.getResume();
		MultipartFile file2=js.getPhoto();
		
		//multipart file store into input stream
		InputStream is1=file1.getInputStream();
		InputStream is2=file2.getInputStream();
		
		//get original file name
		String resumeFile=file1.getOriginalFilename();
		String photoFile=file2.getOriginalFilename();
		
		//create the file output stream for to store into server machine
		/*OutputStream os1=new FileOutputStream(uploadPath+"/"+resumeFile);
		OutputStream os2=new FileOutputStream(uploadPath+"/"+photoFile);*/
		OutputStream os1=new FileOutputStream(uploadPath+resumeFile);
		OutputStream os2=new FileOutputStream(uploadPath+photoFile);
		
		//transfer input stream data to output stream
		is1.transferTo(os1);
		is2.transferTo(os2);
		
		//close the all stream
		is1.close();
		is2.close();
		os1.close();
		os2.close();
		
		//change model class to entity class
		JobSeekerInfo info=new JobSeekerInfo();
		info.setJsName(js.getJsName());
		info.setJsAddrs(js.getJsAddrs());
		/*info.setResumePath(uploadPath+"/"+resumeFile);
		info.setPhotoPath(uploadPath+"/"+photoFile);*/
		info.setResumePath(uploadPath+resumeFile);
		info.setPhotoPath(uploadPath+photoFile);
		
		//call sevice method
		String msg=service.registerJS(info);
		
		//keep result in model attribute
		map.put("result", msg);
		map.put("resumeFile",resumeFile );
		map.put("photoFile",photoFile );
		//return LVN
		return "show_result";
	}
	@GetMapping("/js_report")
	public String showAllJsReport(Map<String,Object> map) {
		List<JobSeekerInfo> li=service.getAllJs();
		map.put("jsInfo", li);
		//return LVN
		return "show_report";
	}
	@GetMapping("/js_download")
	public String getDownloadFile(@RequestParam("id")Integer id,
									@RequestParam("type")String type,
									HttpServletResponse res) {
		String filePath=null;
		if(type.equalsIgnoreCase("resume"))
			filePath=service.fetchResumePathById(id);
		else if(type.equalsIgnoreCase("photo"))
			filePath=service.fetchPhotoPathById(id);
		
		//create file with file path
		File file=new File(filePath);
		
		//response content length should be file length
		res.setContentLengthLong(file.length());
		
		//set mime type to res object
		String mimeType=sc.getMimeType(filePath);
		mimeType=mimeType==null?"application/octet-stream":mimeType;
		
		res.setContentType(mimeType);
		//give instruction to brower to downloable
		res.setHeader("Content-Disposition", "attachment;fileName"+file.getName());
		//create input stream
		try(InputStream is=new FileInputStream(file);
				ServletOutputStream os=res.getOutputStream()
		){
//			is.transferTo(os);
			IOUtils.copy(is, os);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;//it will directly goes to browser
	}
}
