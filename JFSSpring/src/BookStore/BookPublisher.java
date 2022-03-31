package BookStore;

import java.util.List;

public class BookPublisher {
//	Book book;
//int book_count;
List book_list;

public List getBook_list() {
	return book_list;
}

public void setBook_list(List book_list) {
	this.book_list = book_list;
}

@Override
public String toString() {
	return "BookPublisher [book_list=" + book_list + "]";
}


	


//	public int getBook_count() {
//	return book_count;
//}
//
//public void setBook_count(int book_count) {
//	this.book_count = book_count;
//}
//
//	public Book getBook() {
//		return book;
//	}
//
//	public void setBook(Book book) {
//		this.book = book;
//	}
//
//	@Override
//	public String toString() {
//		return "BookPublisher [book=" + book + ", book_count=" + book_count + ", book_list=" + book_list + "]";
//	}
//	

}
