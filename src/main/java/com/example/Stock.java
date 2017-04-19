package com.example;

import java.io.IOException;
import java.util.Date;
import java.io.*;
import javax.faces.bean.*;
import com.example.CSVfileReader;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import org.springframework.web.context.annotation.RequestScope;

//import javax
//com.example.ManagedBean

@ManagedBean(name="stock")
@RequestScope


public class Stock {
	
	private Date _date;
	private String _symbol;//Ticker
	private String _companyName;//ShortName
	private double _price;
	private double _change;
	private double _changePercent;
	private double _closePrice;
	private double _volume;
	private double _marketCap;
	private double _highPrice;
	private double _lowPrice;
	private String _adjClosePrice;
	private String _gicsSectorName;
	private String _exchange;
	
	public String get_gicsSectorName() {
		return _gicsSectorName;
	}
	public void set_gicsSectorName(String _gicsSectorName) {
		this._gicsSectorName = _gicsSectorName;
	}
	public String get_exchange() {
		return _exchange;
	}
	public void set_exchange(String _exchange) {
		this._exchange = _exchange;
	}


	//getter and setter 
	public double get_highPrice() {
		return _highPrice;
	}
	public void set_highPrice(double _highPrice) {
		this._highPrice = _highPrice;
	}
	public double get_lowPrice() {
		return _lowPrice;
	}
	public void set_lowPrice(double _lowPrice) {
		this._lowPrice = _lowPrice;
	}


	public String get_adjClosePrice() {
		return _adjClosePrice;
	}
	public void set_adjClosePrice(String _adjClosePrice) {
		this._adjClosePrice = _adjClosePrice;
	}
	public String get_symbol() {
		return _symbol;
	}
	public void set_symbol(String _symbol) {
		this._symbol = _symbol;
	}
	public Date get_date() {
		return _date;
	}
	public void set_date(Date _date) {
		this._date = _date;
	}
	public String get_companyName() {
		return _companyName;
	}
	public void set_companyName(String _companyName) {
		this._companyName = _companyName;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double _price) {
		this._price = _price;
	}
	public double get_change() {
		return _change;
	}
	
	public void set_change(double _change) {
		this._change = _change;
	}
	
	public double get_changePercent() {
		return _changePercent;
	}
	public void set_changePercent(double _changePercent) {
		this._changePercent = _changePercent;
	}

	public double get_closePrice() {
		return _closePrice;
	}
	public void set_closePrice(double _closePrice) {
		this._closePrice = _closePrice;
	}
	public double get_volume() {
		return _volume;
	}
	public void set_volume(double d) {
		this._volume = d;
	}
	public double get_marketCap() {
		return _marketCap;
	}
	public void set_marketCap(double _marketCap) {
		this._marketCap = _marketCap;
	}

	

    public static void Display()
    {
    //	CSVfileReader r = new CSVfileReader();
    	try {
          CSVfileReader.readCsvForOneSymbol("C:\\Users\\chinatsu\\Desktop\\School\\2017winterSemester\\COMP303_JAVAEE\\demo\\csv\\" ,"AAL");
          //CSVfileReader.readCsvForOneSymbol("C:\\Users\\chinatsu\\Desktop\\School\\2017winterSemester\\COMP303_JAVAEE\\demo\\csv\\", "A");
          CSVfileReader.readCsvForStockCSV("C:\\Users\\chinatsu\\Desktop\\School\\2017winterSemester\\COMP303_JAVAEE\\demo\\csv\\", "Stock");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
    
    public static void Check()
    {
    	
    }


}
