package JFS.BookShopApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MyFavBooks implements MyBookInterface{
	
public void myfavbook() {
	System.out.print("run");
}

public void my1stBook() {
	System.out.println("1st book is fine");
}
}
