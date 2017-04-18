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
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.*;
import javax.faces.bean.ManagedBean;
//import org.joda.time.DateTime;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

import java.util.Date;
import com.example.*;
import com.data.*;
import com.data.StockData;


@ManagedBean(name="csvfilereader")

public class CSVfileReader {

	  

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
		   s.set_marketCap(Double.parseDouble(array[4]));
		    s.set_highPrice(Double.parseDouble(array[2]));
		    s.set_lowPrice(Double.parseDouble(array[3]));
		    s.set_price(Double.parseDouble(array[1]));
		    s.set_symbol(symbol);
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
}





