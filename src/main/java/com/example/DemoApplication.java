package com.example;

import java.io.IOException;
import java.util.SortedMap;
import org.springframework.*;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.*;;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		
	SpringApplication.run(DemoApplication.class, args);
	
    System.out.println("SPring!!!");
//   Stock s = new Stock();
//    Stock.Display();
 // System.out.println(s.get_price());
		
}
}
