package chapter2.t9_innerTest2;

/**
 * class2 被上锁之后，其他线程要执行class2中静态同步方法也只能以同步的方式进行了
 * 全部都是顺序进行的！ class2 作为对象监视器也被同步了
 * @author nickChen
 * @create 2017-04-20 17:57.
 */
public class OutClass {
    static class InnerClass1{
        public void method1(InnerClass2 class2){
            String threadName = Thread.currentThread().getName();
            synchronized (class2){
                System.out.println(threadName +" enter InnerClass1.method1()");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i="+i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                System.out.println(threadName+" exit InnerClass1.method1()");
            }
        }
        public synchronized void method2(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName +" enter InnerClass1.method1()");
            for (int i = 0; i < 10; i++) {
                System.out.println("j="+i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println(threadName+" exit InnerClass1.method1()");
        }
    }
    static class InnerClass2{
        public synchronized void method1(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" enter InnerClass2.method1()");
            for (int i = 0; i < 10; i++) {
                System.out.println("k="+i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println(threadName+" exit InnerClass2.method1()");

        }
    }

}
