package com.data;

import java.util.Date;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;

public class StockData {
	
	private String symbol;

	private Date date;

	private String openPrice;

	private String highPrice;

	private String lowPrice;

	private String closePrice;

	private String adjClosePrice;

	private double volume;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date2) {
		this.date = date2;
	}

	public String getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(String openPrice) {
		this.openPrice = openPrice;
	}

	public String getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(String highPrice) {
		this.highPrice = highPrice;
	}

	public String getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}

	public String getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(String closePrice) {
		this.closePrice = closePrice;
	}

	public String getAdjClosePrice() {
		return adjClosePrice;
	}

	public void setAdjClosePrice(String adjClosePrice) {
		this.adjClosePrice = adjClosePrice;
	}

	public double getVolume() {
		return volume;
	}
	

	public void setVolume(double volume) {
		this.volume = volume;
	}

}
