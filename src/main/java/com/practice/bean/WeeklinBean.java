package com.practice.bean;

/**
 * Created by Y-GH on 2017/6/5.
 */
public class WeeklinBean {
    private String userid;
    private String weeklinname;
    private String tian;
    private String jie;

    public WeeklinBean(String userid, String weeklinname, String tian, String jie) {
        this.userid = userid;
        this.weeklinname = weeklinname;
        this.tian = tian;
        this.jie = jie;
    }

    public String getUserid() {
        return userid;
    }

    public String getWeeklinname() {
        return weeklinname;
    }

    public String getTian() {
        return tian;
    }

    public String getJie() {
        return jie;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setWeeklinname(String weeklinname) {
        this.weeklinname = weeklinname;
    }

    public void setTian(String tian) {
        this.tian = tian;
    }

    public void setJie(String jie) {
        this.jie = jie;
    }
}
