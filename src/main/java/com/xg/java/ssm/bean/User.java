package com.xg.java.ssm.bean;

/**
 * Created by xionggao on 2017/5/11.
 */
public class User {
    private Long id;
    private String name;
    private String phone;

    public User(){}

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
