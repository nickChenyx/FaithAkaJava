package chapter2.t9_setNewPropertiesLockOne;

/**
 * @author nickChen
 * @create 2017-04-21 8:58.
 */
public class UserInfo {
    private String username;
    private String password;

    public UserInfo(){}
    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
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
}
