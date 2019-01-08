package com.zking.ssmProject.model;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String salt;

    private String name;

    private String sex;

    private Integer age;

    private String tel;

    private String other;

    private String roleid;

    private String state;

    private Date addItme;

    private String remark;

    public User(Integer id, String username, String password, String salt, String name, String sex, Integer age, String tel, String other, String roleid, String state, Date addItme, String remark) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tel = tel;
        this.other = other;
        this.roleid = roleid;
        this.state = state;
        this.addItme = addItme;
        this.remark = remark;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getAddItme() {
        return addItme;
    }

    public void setAddItme(Date addItme) {
        this.addItme = addItme;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}