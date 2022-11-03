package com.nt.runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.StockDetails;
import com.nt.service.IStockMgmtService;

@Component
public class StockRunner implements CommandLineRunner {

	@Autowired
	private IStockMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		/*//register stock========
		StockDetails sd=new StockDetails(new Random().nextInt(1000),"Tata_Motors",1200.0,"NSE");
		
		System.out.println(service.registerStock(sd));*/
		
		/*//register multiple stock========
		StockDetails sd1=new StockDetails(new Random().nextInt(1000),"Tata_Steel",1500.0,"NSE");
		StockDetails sd2=new StockDetails(new Random().nextInt(1000),"LIC",300.0,"BSE");
		
		System.out.println(service.registerBulk(List.of(sd1,sd2)));
		*/
		
		/*//find(Query _)=======
		//		service.getStockByExhange("BSE").forEach(p->System.out.println(p));
		
		service.getStockByPriceRange(100.0,1200.0).forEach(p->System.out.println(p));*/
		
		//findById(-)===============
//		System.out.println(service.getStockById(92));
		
		//update===================================
//		System.out.println(service.updateSingleDocById(92, 800.0));
		
//		System.out.println(service.updateMultipleDocByPrice(1000,2000, "NSE"));
		
		//Insert or update==============================
//		System.out.println(service.updateOrInsert("BB", 1300.0));
		
		//delete=======================
//		System.out.println(service.fetchAndRemoveSingleByName("SBI"));
		
		System.out.println(service.fetchAndRemoveAllMultipleByPriceRange(1600.0, 2000.0));
	}

}
