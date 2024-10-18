package com.tedu._04mybatis.pojo;

import javax.xml.crypto.Data;

public class CommentVO1 {
    private int id;
    private String content;
    private Integer userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "CommentVO1{" +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}
