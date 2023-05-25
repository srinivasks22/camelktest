package com.codusingjava.springbootcamel.beans;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class BusinessRule implements Processor{

	  @Override
	  public void process(Exchange exchange) throws Exception {
	    String myString = exchange.getIn().getBody(String.class);
	    System.out.println("myString :::::::::::::::"+myString);
	    StringBuffer sb = new StringBuffer();

	    System.out.println("MyProcessor complete............................");
	    exchange.getIn().setBody(sb.toString()+ ""+ new Date());
	  }

}
