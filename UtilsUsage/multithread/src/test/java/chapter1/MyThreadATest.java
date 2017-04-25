package chapter1;

/**
 * 县城具有随机性，执行顺序是不确定的
 * @author nickChen
 * @create 2017-04-19 11:35.
 */
public class MyThreadATest {
    @org.junit.Test
    public void testRun(){
        try {
            MyThreadA myThreadA = new MyThreadA();
            myThreadA.setName("myThreadA");
            myThreadA.start();
            for (int i = 0; i < 10; i++) {
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}