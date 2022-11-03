package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {

	/*@RequestMapping("/home")
	public String launchHomePage() {
		//return logical view name(LVN)
		return "welcome";
	}*/
	/*@RequestMapping("/home")
	public String launchHomePage(Map<String,Object> map) {
		System.out.println("DispatcherServlet modelmap object :"+map.getClass());
		
		map.put("name","chandan");
		map.put("current_time",LocalDateTime.now());
		//return logical view name(LVN)
		return "welcome";
	}*/
	/*@RequestMapping("/home")
	public String launchHomePage(Model map) {
		System.out.println("DispatcherServlet modelmap object :"+map.getClass());
		
		map.addAttribute("name","chandan");
		map.addAttribute("current_time",LocalDateTime.now());
		//return logical view name(LVN)
		return "welcome";
	}*/
	/*@RequestMapping("/home")
	public String launchHomePage(ModelMap map) {
		System.out.println("DispatcherServlet modelmap object :"+map.getClass());
		
		map.addAttribute("name","chandan");
		map.addAttribute("current_time",LocalDateTime.now());
		//return logical view name(LVN)
		return "welcome";
	}*/
	/*@RequestMapping("/home")
	public Model launchHomePage() {
		Model map=new BindingAwareModelMap();
		map.addAttribute("name","chandan");
		map.addAttribute("current_time",LocalDateTime.now());
		//return logical view name(LVN)
		return map;
	}*/
	/*@RequestMapping("/home")
	public Map<String,Object> launchHomePage() {
		Map<String,Object> map=new HashMap<>();
		map.put("name","chandan");
		map.put("current_time",LocalDateTime.now());
		//return logical view name(LVN)
		return map;
	}*/
	/*@RequestMapping("/home")
	public ModelAndView launchHomePage() {
		ModelAndView map=new ModelAndView();
		map.addObject("name","chandan");
		map.addObject("current_time",LocalDateTime.now());
		
		map.setViewName("welcome");
		//return logical view name(LVN)
		return map;
	}*/
	/*	@RequestMapping("/home")
		public void launchHomePage(Map<String,Object> map) {
			map.put("name","chandan");
			map.put("current_time",LocalDateTime.now());
			
			//return logical view name(LVN)
			return ;
		}*/
	/*@RequestMapping("/home")
	public String launchHomePage(Map<String,Object> map) {
		map.put("name","chandan");
		map.put("current_time",LocalDateTime.now());
		
		//return logical view name(LVN)
		return null;
	}*/
	
	//forward request=======================================
	/*@RequestMapping("/home")
	public String launchHomePage(Map<String,Object> map) {
		map.put("name","chandan");
		map.put("current_time",LocalDateTime.now());
		
		//return logical view name(LVN)
		return "forward:report";
	}
	@RequestMapping("/report")
	public String showReport(Map<String,Object> map) {
		
		
		//return logical view name(LVN)
		return "welcome";
	}*/
	//forward request==============================================
	/*@RequestMapping("/home")
	public String launchHomePage(HttpServletRequest req) {
		
		System.out.println(req.hashCode());
		req.setAttribute("attr1","value1");
		
		//return logical view name(LVN)
		return "forward:report";
	}
	@RequestMapping("/report")
	public String showReport(HttpServletRequest req) {
		System.out.println(req.hashCode());
		
		System.out.println(req.getAttribute("attr1"));
		
		
		//return logical view name(LVN)
		return "welcome";
	}*/
	
	//sendredirect===================================
	/*@RequestMapping("/home")
	public String launchHomePage(HttpServletRequest req) {
		
		System.out.println(req.hashCode());
		req.setAttribute("attr1","value1");
		
		//return logical view name(LVN)
		return "redirect:report";
	}
	@RequestMapping("/report")
	public String showReport(HttpServletRequest req) {
		System.out.println(req.hashCode());
		
		System.out.println(req.getAttribute("attr1"));
		
		
		//return logical view name(LVN)
		return "welcome";
	}*/
	/*@RequestMapping("/home")
	public String launchHomePage(HttpServletRequest req,HttpServletResponse res) {
		
		System.out.println(req.hashCode());
		System.out.println(res.hashCode());
		req.setAttribute("attr1","value1");
		
		//return logical view name(LVN)
		return "welcome";
	}*/
	/*@RequestMapping("/home")
	public String launchHomePage(HttpSession ses) {
		
		ses.setAttribute("attr1","value1");
		
		//return logical view name(LVN)
		return "welcome";
	}*/
	
	/*@Autowired
	private ServletConfig cg;
	@Autowired
	private ServletContext sc;
	
	@RequestMapping("/home")
	public String launchHomePage(Map<String,Object> map) {
		
		System.out.println("servlet Context path :"+sc.getContextPath());
		System.out.println("servlet Config servlet class  name :"+cg.getServletName());
		map.put("name","chandan");
		
		//return logical view name(LVN)
		return "welcome";
	}*/
	
	@RequestMapping("/home")
	public void launchHomePage(HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		pw.println("<h1 style='text-align:center;color:green'>result from direct controller class(Handler class)</h1>");
		pw.close();
		//return logical view name(LVN)
		return ;
	}
	
	
}
