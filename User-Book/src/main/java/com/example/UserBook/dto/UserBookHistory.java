package com.example.UserBook.dto;



import java.io.Serializable;


public class UserBookHistory implements Serializable {
    private Long id;

    public UserBookHistory(Long id, String startdate, String enddate, Long bid, Long uid) {
        this.id = id;
        this.startdate = startdate;
        this.enddate = enddate;
        this.bid = bid;
        this.uid = uid;
    }

    private String startdate;
    private String enddate;
    private Long bid;
    private Long uid;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }


    UserBookHistory(){}

}
