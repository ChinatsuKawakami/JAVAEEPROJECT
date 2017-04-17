package com.example;
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
	
	public static SortedMap<DateTime,StockData> readCsvFunForOneSymbol(String path, String symbol) throws IOException {
		
	//	DateTime time = new DateTime(time);
		
		Stock sto = new Stock();
		SortedMap<DateTime, StockData> result = new TreeMap<DateTime ,StockData>();
		String csvFile = path + symbol + ".csv";
       

	
	try
	{
		File f = new File(csvFile);
		InputStreamReader osr = new InputStreamReader(new FileInputStream(f));
		BufferedReader br = new BufferedReader(osr);
	      
		String line;
		while((line=br.readLine())!= null)
	    {
		  String data[] = line.split(",",0);
		  
		  System.out.println("File:" + symbol);
		  
		    Stock st = new Stock();
		    st.set_symbol(symbol);
		    st.set_companyName(data[1]);
		  /*  st.set_price(Double.parseDouble(data[1]));
		    st.set_change(Double.parseDouble(data[2]));
		    st.set_changePercent(Double.parseDouble(data[3]));*/
		//    st.set_closePrice(Double.parseDouble(data[4]));
		//    st.set_volume(Integer.parseInt(data[5]));
		    st.set_marketCap(Double.parseDouble(data[2]));
		br.close();
		osr.close();
		}// end while
	} catch (IOException e) {
		e.printStackTrace();
	}
	

	return result;
	

}// end of CSV File Reader

   

}
