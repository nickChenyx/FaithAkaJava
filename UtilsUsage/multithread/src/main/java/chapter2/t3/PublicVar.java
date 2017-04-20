package chapter2.t3;

/**
 * 数据出现了脏读现象，共享变量在操作的时候被别的线程读取了。
 * @author nickChen
 * @create 2017-04-20 13:09.
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";
    synchronized public void setValue(String u,String p){
        try {
            username= u;
            Thread.sleep(1000);
            password = p;
            System.out.println("setValue method thread name= "+ Thread.currentThread().getName()+" username=" +
                    username+" password="+password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void getValue(){
        System.out.println("getValue method thread name= "+ Thread.currentThread().getName()+" username=" +
                username+" password="+password);
    }

}
