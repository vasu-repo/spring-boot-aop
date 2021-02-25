package demo.boot.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import demo.boot.model.Book;


@Service
public class BookService {

	private List<Book> books;
	public BookService() {
		books=new ArrayList<>();
		books.add(new Book(1l,"Spring boot recipes " , "Spring boot from some publisher"));
		books.add(new Book(2l,"Pro Spring book", "Pro Spring boot"));
		books.add(new Book(3l,"Learn Spring book", "Pro Spring boot"));
	}
	public List<Book> getBooks(){
		return books;
	}

	public Book getBookById(Long bookId) {
		for(Book b:books ) {
			if(b.getId()==bookId)return b;
			}
		return null;
	}
	public void updateBookByBookId(Long  bookId,Book book) {
		if(book==null) return ;
		for(Book b:books ) {
			if(b.getId()==bookId) {
				b.setName(book.getName());
				b.setDesc(book.getDesc());
			}
			}
	}
	public void addBook(Book book) {
		if(book!=null)
			books.add(book);
		
	}
	public void deletById(String bookId) {
		/*
		 * for(Book b:books ) { if(b.getId().equals(bookId)) books.remove(b); }
		 */
		java.util.Iterator it=books.iterator();
		while(it.hasNext()) {
			Book b=(Book)it.next();
			if(b.getId().equals(bookId))
				it.remove();
			
		}
	}
	
	
}
