package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.IPersonRepo;
import com.nt.repository.IPhoneNumberRepo;

@Service("personMgmtService")
public class PersonMgmtServiceImpl implements IPersonMgmtService {

	@Autowired
	private IPersonRepo perRepo;
	
	@Autowired
	private IPhoneNumberRepo phoneRepo;
	
	
	@Override
	public String saveDataByPerson(Person p) {
		Person per=perRepo.save(p);
		
		return per.getPid()+ " id value Person is saved";
	}
	@Override
	public String saveDataByPhoneNumber(Set<PhoneNumber> st) {
		List<PhoneNumber> li=phoneRepo.saveAll(st);
		return li.size()+" phone number is saved ";
	}
	@Override
	public Iterable<Person> loadByParent() {
		Iterable<Person> it=perRepo.findAll();
		return it;
	}
	@Override
	public Iterable<PhoneNumber> loadByChild() {
		Iterable<PhoneNumber> it=phoneRepo.findAll();
		return it;
	}
	@Override
	public String updateObj(int id,String name,Long mobile,int reg) {
		Optional<Person> opt=perRepo.findById(id);
		if(opt.isPresent()) {
			Person p=opt.get();
			p.setPname(name);
			Set<PhoneNumber> ss=p.getPhones();
			Set<PhoneNumber> phones=ss.stream().filter(ph->ph.getRegNo()==reg).map(m->{m.setMobile(mobile);
																							return m;}).collect(Collectors.toSet());
			
			p.setPhones(phones);
			perRepo.save(p);
			return "Person object is updated";
		}
		return "Id not matched";
	}
	@Override
	public String removeObjById(int pid) {
		Optional<Person> opt=perRepo.findById(pid);
		if(opt.isPresent()) {
		perRepo.deleteById(pid);
		return "Person obj is deleted";
		}
		
		return "Person id is not matched";
	}
	@Override
	public String removeChildByreg(List<Integer> regnos) {
		List<PhoneNumber> liPhones=phoneRepo.findAllById(regnos);
		if(liPhones.size()==0) {
			return "Phone number are not found";
		}else {
			phoneRepo.deleteAll(liPhones);
			return liPhones.size()+" record are deleted";
		}
	}
	@Override
	public String removeOnlyChildFromParent(int pid) {
		Optional<Person> opt=perRepo.findById(pid);
		if(opt.isPresent()) {
			Person p=opt.get();
			Set<PhoneNumber> phones=p.getPhones();
			List<Integer> ids=new ArrayList<>();
			for(PhoneNumber ph:phones) {
				ids.add(ph.getRegNo());
			}
//			System.out.println(ids);
			List<PhoneNumber> liPhones=phoneRepo.findAllById(ids);
			for(PhoneNumber li:liPhones) {
				li.setPer(null);
				phoneRepo.save(li);
				phoneRepo.delete(li);
			}
			return liPhones.size()+" record is deleted";
			/*	Set<PhoneNumber> phones=p.getPhones();
				List<Integer> ids=new ArrayList<>();
				for(PhoneNumber ph:phones) {
					ph.setPer(null);
					ids.add(ph.getRegNo());
					
				}
				System.out.println(ids);
			//			phoneRepo.deleteAllById(ids);
				return phones.size()+" record is deleted";*/
			
		}
		return "Record not found to delete";
	}
}
