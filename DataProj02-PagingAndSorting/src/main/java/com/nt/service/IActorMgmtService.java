package com.nt.service;


import org.springframework.data.domain.Page;

import com.nt.entity.Actor;

public interface IActorMgmtService {
	
	public Iterable<Actor> ShowAllActorBySorted(boolean asc,String... properties);
	public Page<Actor> ShowSinglePage(int pageno,int pagesize);
	public Page<Actor> ShowSinglePageSorted(int pageno,int pagesize,boolean asc);
	public void ShowActorByPage(int pagesize);
	
}
