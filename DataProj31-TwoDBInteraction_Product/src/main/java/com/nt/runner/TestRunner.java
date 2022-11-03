package com.nt.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.offers.Offers;
import com.nt.entity.product.Product;
import com.nt.repo.offers.IOffersRepo;
import com.nt.repo.product.IProductRepo;

@Component
public class TestRunner implements CommandLineRunner{
	
	@Autowired
	private IProductRepo prodRepo;
	@Autowired
	private IOffersRepo offerRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		//save product details==========
		Product p=new Product("Table",12999.0,3.0);
		
		System.out.println(prodRepo.save(p).getPid()+" is saved to product_MDS table");
		
		//save offers details==============
		Offers offer1=new Offers("summer offer",10.0,LocalDate.of(2023, 5, 13));
		Offers offer2=new Offers("winter offer",70.0,LocalDate.of(2023, 12, 14));
		
		int count=offerRepo.saveAll(List.of(offer1,offer2)).size();
		
		System.out.println(count +"  offers record is inserted to Offers_MDS table ");
		
		
		
		
	}
}
