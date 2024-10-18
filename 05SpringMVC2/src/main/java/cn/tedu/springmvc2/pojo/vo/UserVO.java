package cn.tedu.springmvc2.pojo.vo;

import java.util.Date;

public class UserVO {
    private String username;
    private String nickname;
    private Date created;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", created=" + created +
                '}';
    }
}
