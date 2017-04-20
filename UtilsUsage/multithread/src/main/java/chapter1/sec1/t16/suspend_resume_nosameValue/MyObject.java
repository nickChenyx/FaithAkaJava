package chapter1.sec1.t16.suspend_resume_nosameValue;

/**
 * 因为 suspend 暂停了线程导致数据读取的时候不一致！
 * 数据不同步！
 * @author nickChen
 * @create 2017-04-20 9:06.
 */
public class MyObject {
    private String username = "1";
    private String password = "11";
    public void setValue(String u,String p){
        username = u;
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("停止 a 线程(suspend)");
            Thread.currentThread().suspend();
        }
        password = p;
    }
    public void printUsernamePassword(){
        System.out.println(username+" "+password);
    }

}
