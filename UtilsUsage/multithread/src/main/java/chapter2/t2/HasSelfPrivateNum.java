package chapter2.t2;

/**
 * 类成员是线程中共有的变量，没有使用锁进行数据同步，
 * 就会出现结果错乱的情况！
 *
 * @author nickChen
 * @create 2017-04-20 10:17.
 */
public class HasSelfPrivateNum {
    private int num;
    // 将方法设置为 synchronized 可以保证数据准确
    public void add(String username){
        try {
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
