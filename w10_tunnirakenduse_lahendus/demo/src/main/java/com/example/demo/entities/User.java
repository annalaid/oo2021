package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Must enter a name")
    private String subName;

    @NotBlank(message = "Must enter a description")
    private String desc;

    public User() {}

    public User(String subName, String desc) {
        this.subName = subName;
        this.desc = desc;
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

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", sub_name=" + subName + ", desc=" + desc + '}';
    }

}
