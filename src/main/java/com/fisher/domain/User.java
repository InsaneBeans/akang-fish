package com.fisher.domain;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class User {

    private long id;
    private String name;
    private String mark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

}
