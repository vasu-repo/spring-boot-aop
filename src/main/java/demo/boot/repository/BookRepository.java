package demo.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.boot.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
