package com.practice.bean;

/**
 * Created by ygh on 2016/1/26.
 */
public class Userbean {
    private String userid;
    private String password;
    private String username;
    private String sex;
    private String xueyuan;
    private String zhuanye;
    private String type;
    private String headimg;

    public Userbean(String userid, String password, String username, String sex, String xueyuan, String zhuanye, String type, String headimg) {
        this.userid = userid;
        this.password = password;
        this.username = username;
        this.sex = sex;
        this.xueyuan = xueyuan;
        this.zhuanye = zhuanye;
        this.type = type;
        this.headimg = headimg;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    public String getXueyuan() {
        return xueyuan;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public String getType() {
        return type;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setXueyuan(String xueyuan) {
        this.xueyuan = xueyuan;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public void setType(String type) {
        this.type = type;
    }
}
