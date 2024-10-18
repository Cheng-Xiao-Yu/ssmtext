package com.tedu._04mybatis.pojo;

import java.util.Date;

public class Blog {
    private Integer id;
    private String content;
    private Date created;
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer user_id) {
        this.userId = user_id;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                '}';
    }
}
