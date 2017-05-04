package chapter5.timerTest2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer.cancel 取消了所有的队列任务
 * @author nickChen
 * @create 2017-04-24 17:14.
 */
public class Run3 {
    private static Timer timer =new Timer();
    static public class MyTaskA extends TimerTask{
        @Override
        public void run() {
            System.out.println("A running "+new Date());
            timer.cancel();
        }
    }
    static public class MyTaskB extends TimerTask{
        @Override
        public void run() {
            System.out.println("B running "+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTaskA taskA = new MyTaskA();
            MyTaskB taskB = new MyTaskB();
            SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr = "2017-4-24 17:16:00";
            Date date = sdf.parse(dateStr);
            System.out.println("字符串时间："+date+" 当前时间："+new Date());
            timer.schedule(taskA,date,4000);
            timer.schedule(taskB,date,4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
