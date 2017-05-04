package chapter2.t7;

import static org.junit.Assert.*;

/**
 * @author nickChen
 * @create 2017-04-20 14:24.
 */
public class TaskTest {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA a = new ThreadA(task);
        ThreadB b = new ThreadB(task);
        a.start();
        b.start();
    }
}