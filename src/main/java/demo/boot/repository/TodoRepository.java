package demo.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.boot.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
