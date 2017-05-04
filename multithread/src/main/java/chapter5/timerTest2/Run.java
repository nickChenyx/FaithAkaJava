package chapter5.timerTest2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * timer.schedule(task,date,period) 从开始时间起，指定间隔时间重复运行这个任务，
 * 如果开始时间早于当前时间的，即刻开始执行。如果前一个任务运行时间占用了下一个任务的开始时间，
 * 下一个任务的开始时间也往后挪移，在前一个任务完成后即刻开始
 * @author nickChen
 * @create 2017-04-24 15:54.
 */
public class Run {
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了! 当前时间："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr = "2017-4-24 15:57:00";
            Timer timer = new Timer();
            Date date = sdf.parse(dateStr);
            System.out.println("字符串时间："+date+" 当前时间："+new Date());
            timer.schedule(task,date,4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
