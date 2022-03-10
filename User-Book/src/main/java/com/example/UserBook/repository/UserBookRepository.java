package com.example.UserBook.repository;



import com.example.UserBook.Entity.UserBookHistory;
import org.springframework.data.repository.CrudRepository;

public interface UserBookRepository extends CrudRepository<UserBookHistory,Long> {

}
