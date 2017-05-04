package chapter2.t9_innerClass;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 17:42.
 */
public class PublicClassTest {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("user");
        publicClass.setPassword("pass");
        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());
        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("19");
        privateClass.setAddress("address");
        System.out.println(privateClass.getAge()+" "+privateClass.getAddress());
    }
}