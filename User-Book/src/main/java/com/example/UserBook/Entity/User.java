package com.example.UserBook.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;


@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    public Long id;

    private Long number;

    //@OneToMany(cascade = CascadeType.ALL)
    //private Set<UserBookHistory> obj;

    @NotBlank(message="User name should not be null")
    private String name;

    private String address;

    public User(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }






    public User(Long id, String name, String address, Long number){
        this.id=id;
        this.name=name;
        this.address=address;
        this.number=number;
    }

    /*@Override
    public String toString() {
        return "User{" + "id=" + id + ", pname='" + pname + '\'' + ", lname='" + lname + '\'' + ", branch='" + branch + '\'' + '}';
    }*/
}
