package concurrent;

import concurrent.wait_notify.MyWaitNotify;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * 测试 wait 和 notify
 * 对象的wait和notify方法必须在检查到有对象锁
 * 线程如果没有持有对象锁，将不能调用wait()，notify()或者notifyAll()。否则，会抛出IllegalMonitorStateException异常。
 *
 * 参考：http://ifeve.com/thread-signaling/
 * Created by nickChenyx on 2017/4/14.
 */
@RunWith(JUnit4.class)
public class MyWaitNotifyTest {
    @Test
    public void test()throws Exception{
        final MyWaitNotify myWaitNotify = new MyWaitNotify();
        new Thread(){
            @Override
            public void run() {
                myWaitNotify.doWait();
            }
        }.start();
        Thread.sleep(100);
        System.out.println("----");
        myWaitNotify.doNotify();
    }
}
