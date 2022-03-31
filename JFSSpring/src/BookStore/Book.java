package BookStore;

public class Book {
	int price;
	String name;
public void setPrice(int price) {
	this.price=price;
}
public void BookPrice() {
	System.out.println("BOOKPRICE:"+price);
}
public void setName(String name) {
	this.name=name;
}
public void BookName() {
	System.out.println("BOOKNAME:"+name);
}
@Override
public String toString() {
	return "Book [price=" + price + ", name=" + name + "]";
}

}
