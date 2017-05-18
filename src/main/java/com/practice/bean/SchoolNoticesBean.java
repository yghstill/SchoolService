package com.practice.bean;

/**
 * Created by Y-GH on 2017/5/17.
 */
public class SchoolNoticesBean {
    private String noticename;
    private String content;
    private String announcer;
    private String time;

    public SchoolNoticesBean(String noticename, String content, String announcer, String time) {
        this.noticename = noticename;
        this.content = content;
        this.announcer = announcer;
        this.time = time;
    }

    public String getNoticename() {
        return noticename;
    }

    public String getContent() {
        return content;
    }

    public String getAnnouncer() {
        return announcer;
    }

    public String getTime() {
        return time;
    }

    public void setNoticename(String noticename) {
        this.noticename = noticename;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAnnouncer(String announcer) {
        this.announcer = announcer;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
