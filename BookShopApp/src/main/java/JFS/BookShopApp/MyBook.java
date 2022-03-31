package JFS.BookShopApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyBook {
	@Autowired	
	
	
MyFavBooks myFavBooks;
@Autowired
MyFirstBookImp1 myFirstBookImp1;
@Autowired
@Qualifier("MyFavBooks")
MyBookInterface myFirstBookInterface;
public MyFavBooks getMyFavBooks() {
	return myFavBooks;
}

public void setMyFavBooks(MyFavBooks myFavBooks) {
	this.myFavBooks = myFavBooks;
}
public void displayMyBook() {
	System.out.println("My Book Nmae:");
	myFavBooks.myfavbook();
	myFavBooks.my1stBook();
	myFirstBookImp1.my1stBook();
	myFirstBookInterface.my1stBook();
}
public Integer artistCount() {
	Integer artist=100;
	return artist;
}
public void my1stBook() {
	
}
}
