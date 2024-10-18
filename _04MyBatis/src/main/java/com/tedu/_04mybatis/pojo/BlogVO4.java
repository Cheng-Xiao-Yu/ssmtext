package com.tedu._04mybatis.pojo;

import java.util.Date;
import java.util.List;

public class BlogVO4 {
    private Integer id;
    private String content;
    private Date created;
    private Integer userId;
    private List<Comment> comments;

    @Override
    public String
    toString() {
        return "BlogVO4{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                ", comments=" + '\n'+comments +
                '}';
    }

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

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
