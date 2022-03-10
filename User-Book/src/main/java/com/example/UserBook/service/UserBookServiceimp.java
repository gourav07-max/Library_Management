package com.example.UserBook.service;

import com.example.UserBook.Entity.Book;
import com.example.UserBook.Entity.User;
import com.example.UserBook.Entity.UserBookHistory;
import com.example.UserBook.repository.BookRepository;
import com.example.UserBook.repository.UserBookRepository;
import com.example.UserBook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

@Service

public class UserBookServiceimp implements UserBookService {

    @Autowired
    UserBookRepository userBookRepository;

    @Autowired
    UserRepository userRepository;
    @Autowired
    BookRepository bookRepository;




    @Override
    public void issuebook(com.example.UserBook.dto.UserBookHistory userBook){

        UserBookHistory userBookHistory = new UserBookHistory();

        Optional<User> byId = userRepository.findById(userBook.getUid());
        Optional<Book> byId1 = bookRepository.findById(userBook.getBid());

        if(byId.isPresent() && byId1.isPresent()){
            userBookHistory.setBook(byId1.get());
            userBookHistory.setUser(byId.get());
            userBookHistory.setStartdate(userBook.getStartdate());
            userBookHistory.setEnddate(userBook.getEnddate());
            userBookRepository.save(userBookHistory);
        }
    }

    @Override
    public void returnbook(com.example.UserBook.dto.UserBookHistory userBook) {
        //UserBookHistory userBookHistory=new UserBookHistory();

        //Optional<User> user=userRepository.findById(userBook.getUid());
        //Optional<Book> book=bookRepository.findById(userBook.getBid());

        //Optional<UserBookHistory> userBookHistory1=userBookRepository.findById(userBook.getId());
        for (UserBookHistory userBookHistory : userBookRepository.findAll()) {
            if (userBookHistory.getId() == userBook.getId() && StringUtils.isEmpty(userBookHistory.getEnddate())) {
                userBookHistory.setEnddate(userBook.getEnddate());
                userBookRepository.save(userBookHistory);
            }

        }
    }
    @Override
    public void getpopularbook(){
        for (UserBookHistory userBookHistory : userBookRepository.findAll()) {
            
            Integer i=Collections.frequency((Collection<?>) userBookRepository.findAll(),userBookHistory.getUser());

        }


            //UserBookHistory userBookHistory=new UserBookHistory();
            //Collections.frequency((Collection<?>) userBookRepository.findAll(),userBookHistory.getUser());

            }





        }


        //if(userBookHistory1.isPresent()){


          //  }


