package com.example.UserBook.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class Book implements Serializable {

    public Book(@NotNull Long id, @NotBlank(message = "User name should not be null") String name, @NotBlank(message = "User name should not be null") String writer, @NotBlank(message = "User name should not be null") String summary, @NotBlank(message = "User name should not be null") String category) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.summary = summary;
        this.category = category;
    }
    public Book(){}

   // @OneToMany(cascade = CascadeType.ALL)
   // private Set<UserBookHistory> ob;




    public Long id;

    @NotBlank(message="User name should not be null")
    private String name,writer,summary,category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



}
