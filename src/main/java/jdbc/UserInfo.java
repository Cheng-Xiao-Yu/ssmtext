package jdbc;

import jdbc.InputUtil.InputField;
/**
 * 该类的每一个实例用于表示一个用户信息
 *
 * 将来开发中有这样一种类，它没有什么逻辑，每一个实例仅用来表示一组数据
 * 这样的类一般被我们成为"VO"-“Value Object” 值对象
 * VO在不同的使用场合下(项目分层下)又分为不同的名字
 * Entity(实体),VO(View Object),DTO(Data Transfer Object)
 *
 * 它的设计原则:符合JavaBean的设计规范
 * 1:属性私有化
 * 2:提供公开的get，set方法
 * 3:要有无参构造器
 */
public class UserInfo {
    @InputField(title = "用户名",notNull = true,mode={"注册","登录"})
    private String username;
    @InputField(title = "密码",notNull = true,mode={"注册","登录"})
    private String password;
    @InputField(title = "昵称",notNull = true,mode="注册")
    private String nickname;
    @InputField(title = "年龄",notNull = true,mode="注册",regex = "[0-9]{1,2}",regexNotMathTitle = "年龄必须是1-2位数字")
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
