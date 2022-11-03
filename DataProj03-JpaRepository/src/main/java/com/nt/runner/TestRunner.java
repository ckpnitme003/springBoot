package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IActorMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
//		try {
////			List<Actor> li=service.getAllElementById(List.of(23,24,25));
//			/*	List<Integer> al=new ArrayList<>();
//				al.add(23);
//				al.add(24);
//				al.add(101);
//				al.add(null);
//				List<Actor> li=service.getAllElementById(al);*/
//			
//			List<Integer> al=Arrays.asList(23,24,202,null);
//			List<Actor> li=service.getAllElementById(al);
//			
//			li.stream().forEach(p->System.out.println(p));
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		/*try {
			System.out.println(service.removeAllByIdInBatch(Arrays.asList(23,24,101,null)));
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		/*	try {
		//			System.out.println(service.getActorById(25));
				
				Actor actor=service.getActorById(25);
		//			Actor actor=service.getActorById(101);
				
				System.out.println(actor.getClass()+" "+actor.getClass().getSuperclass());
				System.out.println("aid :"+actor.getAid());
				System.out.println("aname :"+actor.getAname());
				System.out.println("category :"+actor.getCategory());
			}catch(Exception e) {
				e.printStackTrace();
			}*/
			try {
				
				Actor actor=new Actor("Ramu","Hero",948339292l);
//				Actor actor=new Actor("ramu","Hero",948339292l);//No Output(beacause ramu name is wrong(Ramu is correct))
//				Actor actor=new Actor("ckp","Hero",948339292l);//No Output(all property should be match)
//				Actor actor=new Actor(null,null,"Hero",null);//correct
				List<Actor> li=service.getActorByActor(actor,true,"aname");
				
				li.forEach(p->System.out.println(p));
	
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
