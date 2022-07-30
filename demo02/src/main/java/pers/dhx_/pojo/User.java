package pers.dhx_.pojo;

/**
 * @author Dhx_
 * @className User
 * @description TODO
 * @date 2022/7/26 8:04
 */
public class User {
    private Integer id;
    private String username;

    User(){}
    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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
    private String password;
}
