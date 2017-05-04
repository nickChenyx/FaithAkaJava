package chapter2.t6;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 14:16.
 */
public class TaskTest {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA a = new ThreadA(task);
        ThreadB b = new ThreadB(task);
        a.start();
        b.start();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
        long beginTime= CommonUtils.beginTime1;
        if (CommonUtils.beginTime2 < CommonUtils.beginTime1){
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2 > CommonUtils.endTime1){
            endTime = CommonUtils.endTime2;
        }
        System.out.println("耗时："+(endTime-beginTime)/1000);
    }
}