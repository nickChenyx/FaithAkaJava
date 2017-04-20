package chapter2.t9_innerTest1;

/**
 * @author nickChen
 * @create 2017-04-20 17:51.
 */
public class OutClass {
    static class Inner{
        public void method1(){
            synchronized ("其他的锁"){
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+" i="+i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }
        public  synchronized void method2(){
            for (int i = 10; i <20 ; i++) {
                System.out.println(Thread.currentThread().getName()+" i="+i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

}
