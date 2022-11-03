package com.nt.service;

import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.UpdateResult;
import com.nt.document.StockDetails;

@Service("serviceMgmt")
public class StockMgmtServiceImpl implements IStockMgmtService{
	
	@Autowired
	private MongoTemplate template;
	
	@Override
	public String registerStock(StockDetails details) {
//		StockDetails sd=template.save(details, "Stock_Details");
		StockDetails sd=template.insert(details, "Stock_Details");
		return sd.getStockId()+" is saved";
	}
	@Override
	public String registerBulk(List<StockDetails> li) {
		Collection<StockDetails> list = template.insert(li, "Stock_Details");
		return list.size()+" number of record is saved";
	}
	@Override
	public List<StockDetails> getStockByExhange(String exchange) {
		Query query=new Query();
		query.addCriteria(Criteria.where("exchangeName").is(exchange));
		return template.find(query, StockDetails.class, "Stock_Details");
	}
	@Override
	public List<StockDetails> getStockByPriceRange(Double start, Double end) {
		Query query=new Query();
		query.addCriteria(Criteria.where("price").gte(start).lte(end));
		return template.find(query, StockDetails.class, "Stock_Details");
	}
	@Override
	public StockDetails getStockById(int id) {
		StockDetails sd=template.findById(id, StockDetails.class, "Stock_Details");
		return sd;
	}
	@Override
	public String updateSingleDocById(int id,double price) {
		
		Query query=new Query();
		query.addCriteria(Criteria.where("stockId").is(id));
		
		Update update=new Update();
		update.set("price",price);
		StockDetails sd=template.findAndModify(query, update, StockDetails.class,"Stock_Details");
		
		return sd==null?"doc not found":"doc updated";
	}
	@Override
	public String updateMultipleDocByPrice(double start, double end, String exchange) {
		Query query=new Query();
		query.addCriteria(Criteria.where("price").gte(start).lte(end));
		
		Update update=new Update();
		update.set("exchangeName", exchange);
		
		UpdateResult result=template.updateMulti(query, update, StockDetails.class,"Stock_Details");
		
		if(result.getModifiedCount()==0)
			return "doc not found";
		else
			return result.getModifiedCount()+" no of doc modified";
	}
	@Override
	public String updateOrInsert(String exchange, double newprice) {
		Query query=new Query();
		query.addCriteria(Criteria.where("exchangeName").is(exchange));
		
		Update update=new Update();
		update.set("price", newprice);
		update.setOnInsert("stockId", new Random().nextInt(1000));
		update.setOnInsert("stockName", "SBI");
		
		
		UpdateResult result=template.upsert(query, update, StockDetails.class,"Stock_Details");
		
		if(result.getModifiedCount()==0)
			return "doc is inserted";
		else
			return "doc modified";
	}	
	
	@Override
	public String fetchAndRemoveSingleByName(String name) {
		Query query=new Query();
		query.addCriteria(Criteria.where("stockName").is(name));
		
		StockDetails sd=template.findAndRemove(query, StockDetails.class,"Stock_Details");
		return sd==null?"doc not found":"doc is deleted" ;
		
	}
	@Override
	public String fetchAndRemoveAllMultipleByPriceRange(double start, double end) {
		Query query=new Query();
		query.addCriteria(Criteria.where("price").gte(start).lte(end));
		
		List<StockDetails> li=template.findAllAndRemove(query, StockDetails.class,"Stock_Details");
		return li.size()+" no of doc deleted";
	}
}
