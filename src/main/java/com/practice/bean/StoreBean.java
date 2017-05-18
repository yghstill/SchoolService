package com.practice.bean;

/**
 * Created by Y-GH on 2017/5/17.
 */
public class StoreBean {
    private String storename;
    private String address;
    private String reason;

    public StoreBean(String storename, String address, String reason) {
        this.storename = storename;
        this.address = address;
        this.reason = reason;
    }

    public String getStorename() {
        return storename;
    }

    public String getAddress() {
        return address;
    }

    public String getReason() {
        return reason;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
