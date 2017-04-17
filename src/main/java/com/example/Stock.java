package com.example;

import java.io.IOException;

import javax.faces.bean.*;
import com.example.CSVfileReader;
import org.springframework.web.context.annotation.RequestScope;

//import javax
//com.example.ManagedBean

@ManagedBean(name="stock")
@RequestScope
public class Stock {
	
	private String _symbol;
	private String _companyName;
	private double _price;
	private double _change;
	private double _changePercent;
	private double _closePrice;
	private int _volume;
	private double _marketCap;
	
	
	//getter and setter 
	
	public String get_symbol() {
		return _symbol;
	}
	public void set_symbol(String _symbol) {
		this._symbol = _symbol;
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
	public int get_volume() {
		return _volume;
	}
	public void set_volume(int _volume) {
		this._volume = _volume;
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
			CSVfileReader.readCsvFunForOneSymbol("/demo/csv/Stock.csv", "ss");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
	

}
