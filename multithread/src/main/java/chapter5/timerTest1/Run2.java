package chapter5.timerTest1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer 可以设置多个任务及延时！
 * @author nickChen
 * @create 2017-04-24 15:41.
 */
public class Run2 {
    private static Timer timer = new Timer();
    static public class MyTask1 extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！ 当前时间为："+new Date());
        }
    }
    static public class MyTask2 extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！ 当前时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            MyTask2 task2 = new MyTask2();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr1 = "2017-4-24 15:46:00";
            String dateStr2 = "2017-4-24 15:47:00";
            Date date1 = sdf1.parse(dateStr1);
            Date date2 = sdf1.parse(dateStr2);
            System.out.println("字符串1时间为："+date1+"当前时间为："+new Date());
            System.out.println("字符串2时间为："+date2+"当前时间为："+new Date());
            timer.schedule(task1,date1);
            timer.schedule(task2,date2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
