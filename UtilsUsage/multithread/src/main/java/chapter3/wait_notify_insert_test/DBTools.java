package chapter3.wait_notify_insert_test;

/**
 * @author nickChen
 * @create 2017-04-21 16:31.
 */
public class DBTools {
    volatile private boolean prevIsA = false;// 确保数据库A先执行，然后与数据库B交替执行
    synchronized public void backupA() {
        try {
            while(prevIsA)
                wait();
            for (int i = 0; i < 3; i++) {
                System.out.println("* * * * *");
            }
            prevIsA = true;
            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    synchronized public void backupB() {
        try {
            while(!prevIsA)
                wait();
            for (int i = 0; i < 3; i++) {
                System.out.println("- - - - -");
            }
            prevIsA=false;
            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
