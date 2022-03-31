package JFS.BookShopApp;

import org.springframework.stereotype.Component;

@Component
public class MyFirstBookImp1 implements MyBookInterface{

public void my1stBook() {
	System.out.println("1st book");
}
}
