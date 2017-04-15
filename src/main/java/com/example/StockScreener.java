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

	private int _deleteId;
	private String _valueEx;
	private String _condition;

	// List to add Removed id
    List removeId = null;
    // count for removeid
     int i = 0;
	 
     
     
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

	 
	 
	
	public int get_deleteId() {
		return _deleteId;
	}



	public void set_deleteId(int _deleteId) {
		this._deleteId = _deleteId;
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
		//String symbol2 = "GOOG";
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
	public void Delete(int deleteId)
	{
		int removeditem;
		 String id = "";
		
		switch(deleteId)
		{
		
		 id = "delete";
		  case id+1:
		  Remove(id+1);
		  removeditem=id+1;
		  break;
		  
		  case id+2:
	      Remove(id+2);
		  removeditem=id+2;
		  break;
		  
		  case id+3:
		  Remove(id+3);
		  removeditem=id+3;
		  break;
		  
		  case id+4:
	      Remove(id+4);
		  removeditem=id+4;
		  break;
		  
		  case id+5:
		  Remove(id+5);
		  removeditem=id+5;
		  break;
		  
		  case id+6:
	      Remove(id+6);
		  removeditem=id+6;
		  break;
		  
		  case id+7:
	      Remove(id+7);
		  removeditem=id+7;
		  break;
	
		}//end switch
		   removeId = new List();
		   removeId.add(i,removeditem);
		   i++;
		
		
	}//Delete method
	
}// end of class

