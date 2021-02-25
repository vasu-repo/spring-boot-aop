package demo.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.boot.model.Book;
import demo.boot.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	BookRepository bookRepository;
	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	@RequestMapping("/books/{bookId}")
	public List<Book> getBookById(@PathVariable("bookId") Long bookId) {
		//return bookRepository.findAllById(bookRepository);
		return null;
	}
	@PutMapping("/books/{bookId}")// @RequestMapping(method = RequestMethod.PUT, value="/books/{bookId}" ) 
	public void updateBookById(@PathVariable Long bookId,@RequestBody Book book) {
		bookRepository.save(book);
	}
	@PostMapping("/books")
	public void addBook(@RequestBody Book book) {		
		bookRepository.save(book);
		}
	@DeleteMapping("/books/{bookId}")
	public void deleteBookById(@PathVariable Long bookId) {
		bookRepository.deleteById(bookId);
	}
	
}

/*
 * @Autowired BookService bookService;
 * 
 * @GetMapping("/books") public List<Book> getBooks() { return
 * bookService.getBooks(); }
 * 
 * @RequestMapping("/books/{bookId}") public Book
 * getBookById(@PathVariable("bookId") String bookId) { return
 * bookService.getBookById(bookId); }
 * 
 * @PutMapping("/books/{bookId}")// @RequestMapping(method = RequestMethod.PUT,
 * value="/books/{bookId}" ) public void updateBookById(@PathVariable String
 * bookId,@RequestBody Book book) { bookService.updateBookByBookId(bookId,book);
 * }
 * 
 * @PostMapping("/books") public void addBook(@RequestBody Book book) {
 * bookService.addBook(book); }
 * 
 * @DeleteMapping("/books/{bookId}") public void deleteBookById(@PathVariable
 * String bookId) { bookService.deletById(bookId); }
 */



/*
 * @RequestMapping("/topics") public List<Topic> getTopics() { return
 * topicService.getTopics(); }
  * 
 * 
 * @RequestMapping("/topics/{foo}") public Topic getTopic(@PathVariable("foo")
 * String id) { return topicService.getTopic(id); }
 * 
 * @RequestMapping("/topics/{id}") public Topic getTopic(@PathVariable String
 * id) { return topicService.getTopic(id); }
 * 
 * @RequestMapping(method = RequestMethod.POST, value="/topics" ) public void
 * addTopic(@RequestBody Topic topic) { topicService.addTopic(topic); }
 * 
 * @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}" ) public
 * void updateTopic(@PathVariable String id,@RequestBody Topic topic) {
 * topicService.updateTopic(id,topic); }
 * 
 * @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}" ) public
 * void deleteTopic(@PathVariable String id) { topicService.deleteTopic(id); }
 */