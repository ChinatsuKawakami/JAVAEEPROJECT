package com.example;

import javax.faces.bean.*;
import javax.faces.*;
import javax.faces.bean.ManagedBean;
import java.io.*;

import javax.swing.*;
import org.h2.command.dml.Insert;
import java.awt.event.*;
import java.util.List;
import java.util.jar.*;
//import other classes
import com.example.Stock;
import com.example.CSVfileReader;


@ManagedBean(name="stockScreener")
@SessionScoped
public class StockScreener {


	private String _valueEx;
	private String _condition;


     
 	public String get_condition() {
		return _condition;
	}

	public void set_condition(String _condition) {
		this._condition = _condition;
	}

	 // check the value (Toronto Exchange)
	 public String get_valueEx() {
		return _valueEx;
	}

	public void set_valueEx(String _valueEx) {
		this._valueEx = _valueEx;
	}

	 
	 
	

	// method to reload 
	public void Reload()
	{
		this.Reload();
	}
	
	// method to read csv file
	public void ShowResult()
	{
		String path = "/demo/csv/";
		String symbol1 ="AMAZ";
		String symbol2 = "GOOG";
		if(this._valueEx=="Exchange")
		{
			CSVfileReader csr = new CSVfileReader();
			try {
				csr.readCsvFunForOneSymbol(path,symbol1);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				csr.readCsvFunForOneSymbol(path,symbol2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
	

 
  //method to delete row
	
}// end of class

