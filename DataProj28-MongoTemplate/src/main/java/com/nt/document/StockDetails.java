package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Stock_Info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDetails {
	
	@Id
	private Integer stockId;
	private String stockName;
	private Double price;
	private String exchangeName;
	
	
	
}
