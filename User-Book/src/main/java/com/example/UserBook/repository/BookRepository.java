package com.example.UserBook.repository;



import com.example.UserBook.Entity.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book,Long> {



}
