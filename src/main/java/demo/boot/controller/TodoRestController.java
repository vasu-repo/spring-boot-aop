package demo.boot.controller;



import java.net.URI;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import demo.boot.model.Book;
import demo.boot.model.Todo;
import demo.boot.repository.TodoRepository;

@RestController //RestController=Controller+ responsbody
@SessionAttributes("name")

public class TodoRestController {

	@Autowired
	TodoRepository todoRepository;
	
	@GetMapping("/hello")
	public Test hello() {
		return new Test("user1");
	}
	@GetMapping("/hello/pathvar/{name}")
	public Test helloWithPathvariable(@PathVariable String name) {
		return new Test(name);
	}
	
	@GetMapping("/todos")
	public List<Todo> listTodos(){
		return todoRepository.findAll();
		
	}
	
	 @GetMapping("/todos/{id}") 
	 public Optional<Todo> listTodoByid(@PathVariable("id") Integer userId){ 
		 return todoRepository.findById(userId);
	  
	 }
	 
	 @DeleteMapping("/deletetodo/{id}")
		public void deleteTodoByid(@PathVariable Integer id) {
		 todoRepository.deleteById(id);
		}
	 @PostMapping("/todos")
		public void addtodo(@RequestBody Todo todo) {		
		 todoRepository.save(todo);
		}
	 @PutMapping("/todos/{id}")
	 public void updateTodoById(@PathVariable Integer id,@RequestBody Todo todo) {
		 Todo getOne = todoRepository.getOne(id);
		 getOne.setUserName(todo.getUserName());
		 getOne.setDescription(todo.getDescription());
		 todoRepository.save(getOne);
		}
	 @PostMapping("/todos1")
		public ResponseEntity addtodo1(@RequestBody Todo todo) {		
		 Todo savedTodo = todoRepository.save(todo);
		URI location= ServletUriComponentsBuilder
						.fromCurrentRequest().path("/{id}")
						.buildAndExpand(savedTodo.getId())
						.toUri();
		 
		return ResponseEntity.created(location).build();
				
	 
	 }
	
	
	
}

class Test{
	int one=1;
	int two=2;
	String name;
	Test(){		
	}
	Test(String name){	
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOne() {
		return one;
	}
	public void setOne(int one) {
		this.one = one;
	}
	public int getTwo() {
		return two;
	}
	public void setTwo(int two) {
		this.two = two;
	}	
	
	
	}