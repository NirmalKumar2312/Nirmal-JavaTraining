package com.shopping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.shopping.BookLists;
@Component
public class BookDetails  {
	@Autowired
	BookLists b;
public void details() {
	
//	@Value("{1,\"java\",1500,\"Sierra\"},{2,\"c++\",1000,\"ram\"}")
//	List<BookLists> array;
	
	List<BookLists> array=new ArrayList<BookLists>();
	array.add(@Value("${"poo1"}"),@Value{"${"JavaBook"}");
//	array.add(new BookLists(1,"java",1500,"Sierra"));
//	array.add(new BookLists(2,"c++",1000,"ram"));
//	array.add(new BookLists(3,"python",2500,"venkat"));
//	array.add(new BookLists(4,"bootstamp",1800,"saravananan"));
	for(BookLists i:array) {
		System.out.println(i);
	}
}
}
