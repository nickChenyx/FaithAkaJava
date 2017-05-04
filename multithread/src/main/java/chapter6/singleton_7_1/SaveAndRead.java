package chapter6.singleton_7_1;

import java.io.*;

/**
 * 序列化和反序列化之后出来的hashCode变不同了
 * // output:
 *           1216125766
 *           1686615835
 *
 * 解决办法是在MyObject 中使用readResolve方法
 * @author nickChen
 * @create 2017-04-25 11:41.
 */
public class SaveAndRead {
    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();
            FileOutputStream fos =  new FileOutputStream(new File("myObjectFile.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myObject);
            oos.close();
            fos.close();
            System.out.println(myObject.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(new File("myObjectFile.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            MyObject myObject = (MyObject) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(myObject.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
