package demo.boot.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import demo.boot.model.Todo;
import demo.boot.repository.TodoRepository;

@Controller
@SessionAttributes("name")

public class TodoController {

	@Autowired
	TodoRepository todoRepository;
	
	@GetMapping("/list-todo")
	public String todoList(ModelMap m) {
		String name=(String)m.get("name");
		List<Todo> list = todoRepository.findAll();
		System.out.println("list size :"+list.size());
		for(Todo t:list)
			System.out.println(t);
		m.addAttribute("list",list );
		m.addAttribute(name);

		return "listTodo";
		
	}
	
	@GetMapping("/add")
	public String addTodo(ModelMap m) {
		m.addAttribute((String)m.get("name"));
		m.addAttribute("todo", new Todo());
		return "addTodo";
		
	}
	@PostMapping("/addTodo")
	public String saveTodo(ModelMap m,@ModelAttribute("todo")Todo todo) throws ParseException {
		String name=(String)m.get("name");		
		todo.setUserName(name);
		todo.setIsCompleted(false);
		todo.setTargetDate(new SimpleDateFormat("dd-MM-yyyy").parse("30-11-2020"));
		todoRepository.save(todo);
		return "redirect:/list-todo";
		
	}
	
	/*@PostMapping("/addTodo")
	public String saveTodo(ModelMap m,@RequestParam("desc") String desc) throws ParseException {
		String name=(String)m.get("name");
		Todo t=new Todo();
		t.setDescription(desc);t.setUserName(name);
		t.setIsCompleted(false);
		t.setTargetDate(new SimpleDateFormat("dd-MM-yyyy").parse("30-11-2020"));
		todoRepository.save(t);
		return "redirect:/list-todo";
		
	}*/
	@GetMapping("/deleteTodo")
	public String deleteTodo(@RequestParam("id") Integer id) {
		todoRepository.deleteById(id);
		return "redirect:/list-todo";
	}

}
