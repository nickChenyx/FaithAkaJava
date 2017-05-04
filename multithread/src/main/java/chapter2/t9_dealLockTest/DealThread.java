package chapter2.t9_dealLockTest;

/**
 * lock1 lock2 造成了死锁！
 * 可以使用 jps 命令来查找当前线程id
 * 再使用 jstack -l id 来查看结果，可以监测出有死锁现象
 * @author nickChen
 * @create 2017-04-20 17:28.
 */
public class DealThread implements Runnable {
    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();
    public void setFlag(String u){
        username = u;
    }

    @Override
    public void run() {
        if (username.equals("a")){
            synchronized (lock1){
                try {
                    System.out.println("username="+username);
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                synchronized (lock2){
                    System.out.println("lock1-->lock2");
                }
            }
        }
        if (username.equals("b")){
            synchronized (lock2){
                try {
                    System.out.println("username="+username);
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                synchronized (lock1){
                    System.out.println("lock2-->lock1");
                }
            }
        }
    }
}
