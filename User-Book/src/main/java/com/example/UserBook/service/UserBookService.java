package com.example.UserBook.service;

public interface UserBookService {

    void issuebook(com.example.UserBook.dto.UserBookHistory userBook);
    void returnbook(com.example.UserBook.dto.UserBookHistory userBook);

    void getpopularbook();
    //void getuserwithmorebooks();
}
