package com.example.UserBook.Entity;


import javax.persistence.*;

@Entity
@Table(name="user_book_history")
public class UserBookHistory {


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startdate;
    private String enddate;



    @ManyToOne
    //Adding the name
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;
//    User u=new User();

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    Book book;




    public UserBookHistory(String startdate, String enddate,Long book,Long user) {
        this.startdate = startdate;
        this.enddate = enddate;
        this.book.id = book;
        this.user.id=user;
    }

    public UserBookHistory(){}

    public String getStartdate() {
        return startdate;
    }

    public String setStartdate(String startdate) {
        this.startdate = startdate;
        return startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public String setEnddate(String enddate) {
        this.enddate = enddate;
        return enddate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public Long setBook(Book book) {
        this.book = book;
        return null;
    }
}
