package com.example.UserBook.Restcontroller;

import com.example.UserBook.Entity.Book;
import com.example.UserBook.Entity.User;
import com.example.UserBook.service.BookService;
import com.example.UserBook.service.UserBookService;
import com.example.UserBook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class MyController {

    @Autowired
    BookService bookService;
    @Autowired
    UserService userService;

    @Autowired
    UserBookService userBookService;





    @GetMapping("/book")
    public List<Book> getAllStudents(){

        return bookService.getAll();
    }

    @PostMapping( "/addbook")
    public void add(@RequestBody @Valid Book s){
        bookService.adds(s);

    }

    @PutMapping("/updatebook")
    public void put(@RequestBody @Valid Book s){
        bookService.update(s);
    }

    @DeleteMapping( "/deletebook")
    public void delete(@RequestBody @Valid Long s){
        bookService.delete(s);
    }


    @GetMapping("/user")
    public List<User> getStudents(){

        return userService.getAll();
    }

    @PostMapping( "/adduser")
    public void add1(@RequestBody @Valid User s){
        userService.adds(s);

    }

    @PutMapping( "/updateuser")
    public void put1(@RequestBody @Valid User s){
        userService.update(s);
    }

    @DeleteMapping(  "/deleteuser")
    public void delete1(@RequestBody @Valid Long s){
        userService.delete(s);
    }

    @PostMapping( "/history")
    public void add2(@RequestBody com.example.UserBook.dto.UserBookHistory s) {
        userBookService.issuebook(s);
    }

    @PutMapping( "/history1")
    public void put1(@RequestBody com.example.UserBook.dto.UserBookHistory s){
        userBookService.returnbook(s);
    }

    @GetMapping("/popular")
    public void getpopular(){

        userBookService.getpopularbook();
    }
    }


















