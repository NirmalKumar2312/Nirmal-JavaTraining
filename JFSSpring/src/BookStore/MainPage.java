package BookStore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		//((AbstractApplicationContext)context).registerShutdownHook();
		//PrintPage printPage=(PrintPage)context.getBean("printpage");
		//printPage.statement();
//		Book book1=(Book)context.getBean("bookbean");
//		book1.setPrice(1800);
//		book1.BookPrice();
//		book1.BookName();
//		Book book2=(Book)context.getBean("bookbean");
//		book2.BookPrice();
//		book2.BookName();
//		System.out.println(book1);
//		System.out.println(book2);
		BookPublisher bookPublisher=(BookPublisher)context.getBean("bookpublisherbean");
		System.out.println(bookPublisher);
		
	}

}
