package com.tedu._04mybatis.pojo;

public class BlogVO3 {
    private Integer id;
    private String content;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "BlogVO3{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}
