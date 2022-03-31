package com.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
public class BookShopApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=SpringApplication.run(BookShopApplication.class, args);
	BookLists b=context.getBean(BookLists.class);
	System.out.print(b);
	BookDetails d=context.getBean(BookDetails.class);
	d.details();
	
	}

}
