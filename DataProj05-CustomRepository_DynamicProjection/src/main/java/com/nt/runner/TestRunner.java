package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.ResultView2;
import com.nt.repository.IActorRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IActorRepo repo;

	@Override
	public void run(String... args) throws Exception {
		/*		//================find names In================
				List<ResultView1> li=repo.findByAnameIn(List.of("Ramu","ranveer"), ResultView1.class);
				
				li.forEach(p->System.out.println(p.getAid()+" "+p.getAname()));*/
		/*//================find aid================
		ResultView3 rs3=repo.findByAidEquals(25,ResultView3.class);
		
		System.out.println(rs3.getAid()+" "+rs3.getAname()+" "+rs3.getCategory());*/
		//================find aid================
		List<ResultView2> li2=repo.findByAnameContainingIgnoreCase("r",ResultView2.class);
		
		li2.forEach(p->System.out.println(p.getCategory()+" "+p.getMobile()));
		
	}
}
