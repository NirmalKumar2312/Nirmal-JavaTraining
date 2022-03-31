package com.shopping;

import org.springframework.stereotype.Component;

@Component
public class BookLists {
String BookId;
String BookName;
int BookPrice;
String AutherName;

//public BookLists(int i, String string, int j, String string2) {
//	// TODO Auto-generated constructor stub
//	this.BookId=i;
//	this.BookName=string;
//	this.BookPrice=j;
//	this.AutherName=string2;
//}

public BookLists(String id,String Name)
{
	this.BookName=Name;
	this.BookId=id;
}
public String getBookName() {
	return BookName;
}

public void setBookName(String bookName) {
	BookName = bookName;
}

public int getBookPrice() {
	return BookPrice;
}

public void setBookPrice(int bookPrice) {
	BookPrice = bookPrice;
}

public String getAutherName() {
	return AutherName;
}

public void setAutherName(String autherName) {
	AutherName = autherName;
}

public int getBookId() {
	return BookId;
}

public void setBookId(int bookId) {
	BookId = bookId;
}

@Override
public String toString() {
	return "Book [BookId=" + BookId + ", BookName=" + BookName + ", BookPrice=" + BookPrice + ", AutherName="
			+ AutherName + "]";
}


}
