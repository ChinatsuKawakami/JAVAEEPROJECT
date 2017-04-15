package com.example;

import javax.annotation.ManagedBean;

import org.springframework.web.context.annotation.RequestScope;

//import javax
//com.example.ManagedBean

@ManagedBean(value="stock")
@RequestScope
public class Stock {
	
	private String _symbol;
	private String _companyName;
	private double _price;
	private double _change;
	private double _changePercent;
	private double _high;
	private double _low;
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
	public double get_high() {
		return _high;
	}
	public void set_high(double _52WkHigh) {
		this._high = _52WkHigh;
	}
	public double get_low() {
		return _low;
	}
	public void set_low(double _52WkLow) {
		this._low = _52WkLow;
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

	
	

}
