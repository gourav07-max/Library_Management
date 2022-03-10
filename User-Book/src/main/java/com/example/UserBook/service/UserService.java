package com.example.UserBook.service;


import com.example.UserBook.Entity.User;

import java.util.List;

public interface UserService {
    void adds(User b);
    void update(User s);
    void delete(Long s);
    List<User> getAll();
}
