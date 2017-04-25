package chapter1.t15;

/**
 * @author nickChen
 * @create 2017-04-19 17:41.
 */
public class SynchronizedObject {
    private String username="a";
    private String password="aa";

    synchronized public void printString(String username,String password){
        try {
            this.username = username;
            Thread.sleep(100000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
