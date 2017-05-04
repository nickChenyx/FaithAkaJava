package chapter2.t9_innerStaticClass;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 17:48.
 */
public class PublicClassTest {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("user");
        publicClass.setPassword("pass");
        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());
        PublicClass.PrivateClass privateClass = new PublicClass.PrivateClass();
        privateClass.setAge("18");
        privateClass.setAddress("adress");
        System.out.println(privateClass.getAge()+" "+privateClass.getAddress());
    }
}