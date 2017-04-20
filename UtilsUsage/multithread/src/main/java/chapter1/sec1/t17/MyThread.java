package chapter1.sec1.t17;

/**
 * yield() 方法的作用是放弃当前的cpu资源，将他让给其他任务去占用cpu执行时间，
 * 但放弃的时间不确定，有可能刚放弃又获得cpu时间片
 *
 * @author nickChen
 * @create 2017-04-20 9:13.
 */
public class MyThread extends  Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 500000; i++) {
//            Thread.yield();
            count+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println("use time :"+(end-start)+"ms");
    }

    public static void main(String[] args) {
        MyThread t  =  new MyThread();
        t.start();
    }
}
