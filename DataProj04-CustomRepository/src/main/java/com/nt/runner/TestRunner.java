package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IActorRepo repo;

	@Override
	public void run(String... args) throws Exception {
		//actor insert
		/*Actor ac=repo.save(new Actor("ramu","actor",89833892l));
		System.out.println("actor is saved with id :"+ac.getAid());*/
		//================find name equals================
		/*	System.out.println("=================");
			List<Actor> li1=repo.findByAnameEquals("Ramu");
			li1.stream().forEach(p->System.out.println(p));*/
		/*System.out.println("=================");
		List<Actor> li2=repo.findByAnameIs("Ramu");
		li2.stream().forEach(p->System.out.println(p));
		System.out.println("=================");
		List<Actor> li3=repo.findByAname("Ramu");
		li3.stream().forEach(p->System.out.println(p));
		*/
		//================find name and aid================
		/*System.out.println("=================");
		Actor ac=repo.findByAidAndAname(88,"Ramu");
		System.out.println(ac);*/
		//================find name or aid================
		/*System.out.println("=================");
		List<Actor> li=repo.findByAidOrAname(41,"Ramu");
		li.stream().forEach(p->System.out.println(p));*/
		//================find aid between================
		/*System.out.println("=================");
		List<Actor> li1=repo.findByAidBetween(41,88);
		li1.stream().forEach(p->System.out.println(p));
		//================find aid LessThan================
		System.out.println("=================");
		List<Actor> li2=repo.findByAidLessThan(87);
		li2.stream().forEach(p->System.out.println(p));*/
		//================find aid LessThanEqual================
		/*System.out.println("=================");
		List<Actor> li=repo.findByAidLessThanEqual(88);
		li.stream().forEach(p->System.out.println(p));
			//================find aid GreaterThan================
			System.out.println("=================");
			List<Actor> li1=repo.findByAidGreaterThan(26);
			li1.stream().forEach(p->System.out.println(p));*/
		/*//================find aid GreaterThanEqual================
		System.out.println("=================");
		List<Actor> li2=repo.findByAidGreaterThanEqual(26);
		li2.stream().forEach(p->System.out.println(p));*/
		//================find name like================
		/*	System.out.println("=================");
			List<Actor> li2=repo.findByAnameLike("%r%");
			List<Actor> li3=repo.findByAnameLike("R%");
			List<Actor> li4=repo.findByAnameLike("%h");
			li2.stream().forEach(p->System.out.println(p));
			li3.stream().forEach(p->System.out.println(p));
			li4.stream().forEach(p->System.out.println(p));*/
		//================find name Starting with================
		/*System.out.println("=================");
		List<Actor> li2=repo.findByAnameStartingWith("R");
		li2.stream().forEach(p->System.out.println(p));*/
		/*//================find name containing================
			System.out.println("=================");
			List<Actor> li2=repo.findByAnameContaining("m");
			li2.stream().forEach(p->System.out.println(p));*/
		/*//================find name not equal================
			System.out.println("=================");
			List<Actor> li2=repo.findByAnameNot("Ramu");
			li2.stream().forEach(p->System.out.println(p));*/
		//================find id in================
		/*System.out.println("=================");
		//			List<Actor> li2=repo.findByAidIn(Arrays.asList(87,88));
		List<Actor> li2=repo.findByAidIn(List.of(87,88));
		li2.stream().forEach(p->System.out.println(p));*/
		
		/*	//================find id not in================
				System.out.println("=================");
				List<Actor> li2=repo.findByAidNotIn(Arrays.asList(25,27,29));
				li2.stream().forEach(p->System.out.println(p));
		*/
		//================find Name Ignore case================
		/*	System.out.println("=================");
			List<Actor> li2=repo.findByAnameIgnoreCase("ramu");
			li2.stream().forEach(p->System.out.println(p));*/
		//================find aid<= and aid>= order by name desc Ignore case================
		/*	System.out.println("=================");
			List<Actor> li2=repo.findByAidGreaterThanEqualAndAidLessThanEqualOrderByAnameDesc(22,30);
			li2.stream().forEach(p->System.out.println(p));
		
		*/
		//scalar operation
			//==========================
		 //=============find by mobile number==========
		/*Iterable<ResultView> itr=repo.findByCategoryEquals("Hero");
		itr.forEach(p->System.out.println(p.getAid()+" "+p.getAname()+" "+p.getMobile()+" "+p.getClass()));
		System.out.println(repo.getClass());
			
			 //=============find by aid ==========
			ResultView view=repo.findByAidEquals(22);
			System.out.println(view.getAid()+" "+view.getAname()+" "+view.getMobile());
			 */
	}
}
