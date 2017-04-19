package designpattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by nickChenyx on 2017/4/14.
 */
@RunWith(JUnit4.class)
public class SingletonTest {

    /**
     * 很容易出错
     designpattern.Singleton@4dd849ae
     designpattern.Singleton@4dd849ae
     designpattern.Singleton@32cd666f
     designpattern.Singleton@4dd849ae
     designpattern.Singleton@4dd849ae
     designpattern.Singleton@4dd849ae
     designpattern.Singleton@4dd849ae
     designpattern.Singleton@4dd849ae
     */
    @Test
    public void test(){
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executor.execute(new Test1());
        }
        executor.shutdown();
    }

    private class Test1 implements Runnable{
        public void run() {
            try {
                Singleton1 s = Singleton1.getSingleton();
                System.out.println(s.toString());
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
