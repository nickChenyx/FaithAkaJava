package chapter1.t6;

import org.junit.Test;

/**
 * @author nickChen
 * @create 2017-04-19 13:41.
 */
public class CountOperateTest {
    @Test
    public void run()throws Exception{
        CountOperate countOperate = new CountOperate();
        new Thread(countOperate,"A").start();
        Thread.sleep(500);
    }
}