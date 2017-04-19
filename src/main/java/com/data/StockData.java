package com.data;

import java.util.Date;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;

public class StockData {
	private String _companyName;
	private double _marketCap;

	
	
	public String get_companyName() {
		return _companyName;
	}
	public void set_companyName(String _companyName) {
		this._companyName = _companyName;
	}
	public double get_marketCap() {
		return _marketCap;
	}
	public void set_marketCap(double _marketCap) {
		this._marketCap = _marketCap;
	}
	public String get_exChange() {
		return _exChange;
	}
	public void set_exChange(String _exChange) {
		this._exChange = _exChange;
	}
	private String _exChange;
	
}
