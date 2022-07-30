package pers.dhx_.pojo;

import java.util.SimpleTimeZone;

/**
 * @author Dhx_
 * @className User
 * @description TODO
 * @date 2022/7/27 18:42
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private  Integer age;
    User(){}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
    public User(Integer id, String username, String password, Integer age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }
}
