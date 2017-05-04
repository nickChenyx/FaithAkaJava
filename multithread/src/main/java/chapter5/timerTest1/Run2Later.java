package chapter5.timerTest1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer 是一个队列顺序执行的，如果前面一个任务因为执行时间太长超过了后一个任务的开始时间，
 * 后一个时间的开始时间也要往后挪移
 * @author nickChen
 * @create 2017-04-24 15:47.
 */
public class Run2Later {
    private static Timer timer = new Timer();
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 运行了！ 当前时间为："+new Date());
                Thread.sleep(20000);
                System.out.println("1 结束了！ 当前时间为："+new Date());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    static public class MyTask2 extends TimerTask{
        @Override
        public void run() {
            try {
                System.out.println("2 运行了！ 当前时间为："+new Date());
                Thread.sleep(20000);
                System.out.println("2 结束了！ 当前时间为："+new Date());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            MyTask2 task2 = new MyTask2();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr1 = "2017-4-24 15:52:00";
            String dateStr2 = "2017-4-24 15:52:10";
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
