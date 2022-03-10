package com.example.UserBook.service;

//import com.example.Postgresql.Entity.Student;
import com.example.UserBook.Entity.Book;

import java.util.List;

public interface BookService {

    void adds(Book b);
    void update(Book s);
    void delete(Long s);
    List<Book> getAll();

}
