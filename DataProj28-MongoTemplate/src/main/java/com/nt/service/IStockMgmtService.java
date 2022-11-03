package com.nt.service;

import java.util.List;

import com.nt.document.StockDetails;

public interface IStockMgmtService {
	
	public String registerStock(StockDetails details);
	public String registerBulk(List<StockDetails> li);
	public List<StockDetails> getStockByExhange(String exchange);
	public List<StockDetails> getStockByPriceRange(Double start,Double end);
	public StockDetails getStockById(int id);
	public String updateSingleDocById(int id,double price);
	public String updateMultipleDocByPrice(double start,double end,String exchange);
	public String updateOrInsert(String exchange,double newprice);
	public String fetchAndRemoveSingleByName(String name);
	public String fetchAndRemoveAllMultipleByPriceRange(double start,double end);
}
