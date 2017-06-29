package com.practice.bean;

/**
 * Created by Y-GH on 2017/5/16.
 */
public class PictureBean {
    private String useid;
    private String imgpath;
    private String imgdesc;
    private String imgtime;
    private String imgid;
    private String url;

    public PictureBean(String useid, String imgpath, String imgdesc, String imgtime, String imgid, String url) {
        this.useid = useid;
        this.imgpath = imgpath;
        this.imgdesc = imgdesc;
        this.imgtime = imgtime;
        this.imgid = imgid;
        this.url = url;
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUseid() {
        return useid;
    }

    public String getImgpath() {
        return imgpath;
    }

    public String getImgdesc() {
        return imgdesc;
    }

    public String getImgtime() {
        return imgtime;
    }

    public void setUseid(String useid) {
        this.useid = useid;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public void setImgdesc(String imgdesc) {
        this.imgdesc = imgdesc;
    }

    public void setImgtime(String imgtime) {
        this.imgtime = imgtime;
    }
}
