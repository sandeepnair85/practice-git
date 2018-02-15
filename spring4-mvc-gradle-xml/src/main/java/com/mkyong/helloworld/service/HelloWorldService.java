package com.mkyong.helloworld.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class HelloWorldService {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldService.class);

	public String getDesc() {

		LOGGER.debug("getDesc() is executed!");

		return "Gradle + Spring MVC Hello World Example";

	}

	public String getTitle(final String name) {

		LOGGER.debug("getTitle() is executed! $name : {}", name);

		if(StringUtils.isEmpty(name)){
			return "Hello World";
		}else{
			return "Hello " + name;
		}
		
	}

}