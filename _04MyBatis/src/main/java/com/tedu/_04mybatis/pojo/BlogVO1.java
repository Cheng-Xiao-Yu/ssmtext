package com.tedu._04mybatis.pojo;

import java.util.Date;

public class BlogVO1 {
    private String content;
    private Date created;

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

    @Override
    public String toString() {
        return "BlogVO1{" +
                "content='" + content + '\'' +
                ", created=" + created +
                '}';
    }
}
