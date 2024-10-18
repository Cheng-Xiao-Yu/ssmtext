package com.tedu._04mybatis.pojo;

import java.util.Date;

public class Comment {
    private int id;
    private String content;
    private Date created;
    private Integer userId;
    private Integer blogId;

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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                ", blogId=" + blogId +
                '}'+'\n';
    }
}
/*
CREATE TABLE comment(
        id INT PRIMARY KEY AUTO_INCREMENT,
        content VARCHAR(255),
created TIMESTAMP,
user_id INT,
blog_id INT*/
