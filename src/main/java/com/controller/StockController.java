package com.controller;
import java.text.SimpleDateFormat;

import org.apache.*;
import org.apache.commons.logging.LogFactory;
import org.springframework.*;
import org.springframework.stereotype.Controller;

import com.example.*;
import com.data.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StockController {
	private static final Log logger = LogFactory.getLog(StockController.class);
	
	@RequestMapping(value="/Index",method = RequestMethod.GET)
		public String inputIndex(){
			logger.info("input Index");
			return "Index";
		}
		
	@RequestMapping(value="/ShowResult",method = RequestMethod.GET)
	public String showResult(Stock stock,Model model)
	{
		
		logger.info("Show Result called");
		
		Stock s = new Stock();
        s.set_date(stock.get_date());
	    s.set_adjClosePrice(stock.get_adjClosePrice());
	    s.set_marketCap(stock.get_marketCap());
	    s.set_highPrice(stock.get_highPrice());
	    s.set_lowPrice(stock.get_lowPrice());
	    s.set_price(stock.get_price());
	    s.set_symbol(stock.get_symbol());
	    s.set_volume(stock.get_volume());
		return "ShowResult";
    }
	
}


