package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepo;


@Service("ActorService")
public class ActorServiceImpl implements IActorMgmtService {
	
	@Autowired
	private IActorRepo repo;
	
	@Override
	public Iterable<Actor> ShowAllActorBySorted(boolean asc, String... properties) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, properties);
		Iterable<Actor> itr = repo.findAll(sort);
		return itr;
	}
	@Override
	public Page<Actor> ShowSinglePage(int pageno, int pagesize) {
		
		Pageable pageable =PageRequest.of(pageno, pagesize);
		
		Page<Actor> page=repo.findAll(pageable);
		return page;
	}
	@Override
	public Page<Actor> ShowSinglePageSorted(int pageno, int pagesize, boolean asc) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,"aid");
		Pageable pageable=PageRequest.of(pageno, pagesize, sort);
		Page<Actor> page=repo.findAll(pageable);
		return page;
	}
	@Override
	public void ShowActorByPage(int pagesize) {
		long recordCount=repo.count();
		long pageCount=recordCount/pagesize;
		 pageCount=(recordCount%pagesize==0)?pageCount:pageCount++;
		
		 for(int i=0;i<pageCount;i++) {
			 Pageable pageable=PageRequest.of(i, pagesize);
			 Page<Actor> page=repo.findAll(pageable);
			 System.out.println("page number -"+(i+1));
			 page.getContent().forEach(p->System.out.println(p));
		 }
	}
}
