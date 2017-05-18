package com.practice.bean;

/**
 * Created by Y-GH on 2017/5/17.
 */
public class PlaygroundBean {
    private String funningname;
    private String address;
    private String comment;

    public PlaygroundBean(String funningname, String address, String comment) {
        this.funningname = funningname;
        this.address = address;
        this.comment = comment;
    }

    public String getFunningname() {
        return funningname;
    }

    public String getAddress() {
        return address;
    }

    public String getComment() {
        return comment;
    }

    public void setFunningname(String funningname) {
        this.funningname = funningname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
