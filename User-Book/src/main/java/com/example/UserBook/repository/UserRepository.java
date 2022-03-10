package com.example.UserBook.repository;

import com.example.UserBook.Entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Long> {

}
