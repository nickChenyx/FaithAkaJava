package chapter2.t1;

/**
 * 方法体内的变量是私有的，是线程安全的
 * @author nickChen
 * @create 2017-04-20 10:17.
 */
public class HasSelfPrivateNum {
    public void add(String username){
        try {
            int num = 0;
            if (username.equals("a")){
                num = 100;
                System.out.println("a set over");
                Thread.sleep(200);
            }else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username+" num="+num);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
