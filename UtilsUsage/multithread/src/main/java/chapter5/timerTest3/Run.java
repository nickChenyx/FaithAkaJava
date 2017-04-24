package chapter5.timerTest3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * timer.schedule(task,delay)
 * timer.schedule(task,delay,period)
 * @author nickChen
 * @create 2017-04-24 17:24.
 */
public class Run {
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("running ... "+new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间："+new Date());
//        timer.schedule(task,7000);
        timer.schedule(task,7000,1000);
    }

}
