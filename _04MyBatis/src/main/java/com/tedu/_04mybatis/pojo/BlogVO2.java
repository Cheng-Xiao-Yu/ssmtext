package com.tedu._04mybatis.pojo;

public class BlogVO2 {
    private Integer userId;
    private String content;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BlogVO2{" +
                "userId=" + userId +
                ", content='" + content + '\'' +
                '}';
    }
}
