package com.codeusingjava.springbootcamel.route;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://scheduler?fixedRate=true&period=5s").log("Hello World!");
	}
}
