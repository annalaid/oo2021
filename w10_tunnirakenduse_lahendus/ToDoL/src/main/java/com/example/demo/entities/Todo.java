package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Must enter a subject")
    private String subName;

    @NotBlank(message = "Must enter a description")
    private String desc;

    private String date;

    public Todo() {}

    public Todo(String subName, String desc, String date) {
        this.subName = subName;
        this.desc = desc;
        this.date = date;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setSubName(String subName) {
        this.subName = subName;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSubName() {
        return subName;
    }

    public String getDesc() {
        return desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", sub_name=" + subName + ", desc=" + desc + ", date=" + date + '}';
    }

}
