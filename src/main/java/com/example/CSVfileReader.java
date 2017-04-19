package com.example;

import com.example.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.*;
import javax.faces.bean.ManagedBean;
//import org.joda.time.DateTime;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

import java.util.Date;
import java.util.LinkedHashMap;

import com.example.*;
import com.data.*;
import com.data.StockData;

@ManagedBean(name="csvfilereader")

public class CSVfileReader {

	private String _kindOfCriteria;
	private String _kindOfCriteria2;
	private String _kindOfCriteria3;
	private String _kindOfCriteria4;


	private String _kindOfValue;
	private String _kindOfValue2;
    private String _kindOfValue3;
    private String _kindOfValue4;
	
	private String _condition;
	private String _condition2;
	private String _condition3;
	private String _condition4;
	
	
	
	public String get_kindOfValue3() {
		return _kindOfValue3;
	}


	public void set_kindOfValue3(String _kindOfValue3) {
		this._kindOfValue3 = _kindOfValue3;
	}


	public String get_kindOfValue4() {
		return _kindOfValue4;
	}


	public void set_kindOfValue4(String _kindOfValue4) {
		this._kindOfValue4 = _kindOfValue4;
	}


	public String get_condition3() {
		return _condition3;
	}


	public void set_condition3(String _condition3) {
		this._condition3 = _condition3;
	}


	public String get_condition4() {
		return _condition4;
	}


	public void set_condition4(String _condition4) {
		this._condition4 = _condition4;
	}


	public String get_kindOfCriteria3() {
		return _kindOfCriteria3;
	}


	public void set_kindOfCriteria3(String _kindOfCriteria3) {
		this._kindOfCriteria3 = _kindOfCriteria3;
	}


	public String get_kindOfCriteria4() {
		return _kindOfCriteria4;
	}


	public void set_kindOfCriteria4(String _kindOfCriteria4) {
		this._kindOfCriteria4 = _kindOfCriteria4;
	}


	
	public String get_kindOfValue2() {
		return _kindOfValue2;
	}


	public void set_kindOfValue2(String _kindOfValue2) {
		this._kindOfValue2 = _kindOfValue2;
	}


	public String get_kindOfCriteria2() {
		return _kindOfCriteria2;
	}


	public void set_kindOfCriteria2(String _kindOfCriteria2) {
		this._kindOfCriteria2 = _kindOfCriteria2;
	}


	public String get_condition2() {
		return _condition2;
	}


	public void set_condition2(String _condition2) {
		this._condition2 = _condition2;
	}


	public String get_condition() {
		return _condition;
	}


	public void set_condition(String _condition) {
		this._condition = _condition;
	}


	public String get_kindOfCriteria() {
		return _kindOfCriteria;
	}


	public void set_kindOfCriteria(String _kindOfCriteria) {
		this._kindOfCriteria = _kindOfCriteria;
	}
    
     

	public String get_kindOfValue() {
		return _kindOfValue;
	}


	public void set_kindOfValue(String _kindOfValue) {
		this._kindOfValue = _kindOfValue;
	}

	
	private Integer choose;
	public Integer getChoose() {
		return choose;
	}

	public void setChoose(Integer choose) {
		this.choose = choose;
	}
	
	private static Map<String,Integer>values;
	

	static
	{
		values=new LinkedHashMap<>();
		values.put("0", 0);
		values.put("100m", 100);
		values.put("250m", 250);
		values.put("500m", 500);
		values.put("1b", 1);
		values.put("2b", 2);
		values.put("3b", 3);
		values.put("4b", 4);
		values.put("5b", 5);
		values.put("10b",10);
		values.put("15b",15);
		values.put("25b", 25);
		values.put("50b", 50);
		values.put("75b", 75);
		values.put("100b",100);
		values.put("200b",200);
	}
   
	public Map<String,Integer>getValues()
	{
		return values;
	}

	public static final SimpleDateFormat DATE_FORMAT =new SimpleDateFormat("yyyy-MM-dd");
	public static SortedMap<Date, Stock> readCsvForOneSymbol(String path, String symbol)throws IOException {
	SortedMap<Date, Stock> result = new TreeMap<Date, Stock>();

	
	String csvFile = path + symbol + ".csv";
	System.out.println("csv file: " + csvFile);
   FileReader rd = new FileReader(csvFile);

	try {

	    BufferedReader br
        = new BufferedReader(rd );
 
		  String line="";
		
		while ((line = br.readLine()) != null) {
			String array[] = line.split( "," );
			Stock s = new Stock();
            s.set_date(DATE_FORMAT.parse(array[0]));
		    s.set_adjClosePrice(array[6]);
		 // s.set_marketCap(Double.parseDouble(array[4]));
		    s.set_highPrice(Double.parseDouble(array[2]));
		    s.set_lowPrice(Double.parseDouble(array[3]));
		    s.set_price(Double.parseDouble(array[1]));
		 
		    s.set_volume(Double.parseDouble(array[5]));
		    
	

		}//end while
		
         br.close();
         rd.close();
	   }
	   catch(Exception e)
	   {
		  System.out.println(e);
	   }
	
	   
	return result;

}// end of CSV File Reader
	
	
	public static SortedMap<Date, Stock> readCsvForStockCSV(String path, String symbol)throws IOException {
		SortedMap<Date, Stock> result = new TreeMap<Date, Stock>();
      
		
		
		String csvFile = path + symbol + ".csv";
	//	System.out.println("csv file: " + csvFile);
	   FileReader rd = new FileReader(csvFile);

		try {

		    BufferedReader br
	        = new BufferedReader(rd );
	 
			  String line="";
			
			while ((line = br.readLine()) != null) {
				String array[] = line.split( "," );
				Stock s = new Stock();
	           
		       s.set_exchange(array[3]);
		       s.set_gicsSectorName(array[4]);
		       s.set_symbol(array[0]);
			   s.set_marketCap(Double.parseDouble(array[2]));
			   s.set_companyName(array[1]);
		       
		     
			}//end while
			
	         br.close();
	         rd.close();
		   }
		   catch(Exception e)
		   {
			  System.out.println(e);
		   }
		return result;
		
	}
}





