package com.example.UserBook.service;

import com.example.UserBook.Entity.User;
import com.example.UserBook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceimp implements UserService {


    @Autowired
    UserRepository userRepository;

    List<User> users=new ArrayList<>();

@Override
    public List<User> getAll() {
        Iterable<User> users=userRepository.findAll();
        List<User> userArrayList=new ArrayList<>();
        for(User user:users){
            User user1=new User(user.getId(),user.getName(),user.getAddress(),user.getNumber());
            userArrayList.add(user1);
        }
        return userArrayList;
    }


@Override
    public void update(User s){

        for(User user:userRepository.findAll()){
            if(s.getId()==user.getId()){

                user.setName(s.getName());
                user.setNumber(s.getNumber());
                user.setAddress(s.getAddress());

                userRepository.save(user);
            }
        }
    }

    @Override
    public void delete(Long s){
        for(User user:userRepository.findAll()){
            if(user.getId()==s){
                userRepository.deleteById(s);
                break;
            }
        }
    }

@Override

    public void adds(User s){
        User user=new User(s.getId(),s.getName(),s.getAddress(),s.getNumber());
        user.setId(s.getId());
        user.setName(s.getName());
        user.setAddress(s.getAddress());
        user.setNumber(s.getNumber());

        userRepository.save(user);

    }
}
