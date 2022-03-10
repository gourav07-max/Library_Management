package com.example.UserBook.service;

import com.example.UserBook.Entity.Book;
import com.example.UserBook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//or @component
public class BookServiceimp implements BookService {

    @Autowired
    BookRepository bookRepository;

    List<Book> books=new ArrayList<>();

    @Override
    public List<Book> getAll() {
        Iterable<Book> books=bookRepository.findAll();
        List<Book> bookArrayList=new ArrayList<>();
        for(Book book:books){
            Book student=new Book(book.getId(),book.getName(),book.getWriter(),book.getSummary(),book.getCategory());
            bookArrayList.add(student);
        }
        return bookArrayList;
    }



    @Override

    public void update(Book s){

        for(Book book:bookRepository.findAll()){
            if(s.getId()==book.getId()){

                book.setName(s.getName());
                book.setCategory(s.getCategory());
                book.setSummary(s.getSummary());
                book.setWriter(s.getWriter());
                bookRepository.save(book);
            }
        }
    }
    @Override
    public void delete(Long s){
        for(Book book:bookRepository.findAll()){
            if(book.getId()==s){
                bookRepository.deleteById(s);
                break;
            }
        }
    }

@Override

    public void adds(Book s){
        Book book=new Book(s.getId(),s.getName(),s.getWriter(),s.getSummary(),s.getCategory());
        book.setId(s.getId());
        book.setName(s.getName());
        book.setWriter(s.getWriter());
        book.setSummary(s.getSummary());
        book.setCategory(s.getCategory());
        bookRepository.save(book);

    }







}
