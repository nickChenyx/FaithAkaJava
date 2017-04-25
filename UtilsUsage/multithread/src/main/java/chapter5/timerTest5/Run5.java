package chapter5.timerTest5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * timer.scheduleAtFixedRate 具有追赶执行性，如果设置的开始时间早于当前时间，
 * timer.scheduleAtFixedRate 会去追赶之前未执行的次数，如 Run4.java 中展示那样
 * timer.schedule 不具有追赶执行性，即使开始时间早于当前时间，timer.schedule也是直接从
 * 当前时间开始运行
 * @author nickChen
 * @create 2017-04-25 9:41.
 */
public class Run5 {
    private static Timer timer = new Timer();
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1  begin running  time: " + new Date());
                System.out.println("1    end running  time: " + new Date());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr = "2017-4-25 9:46:30";
            Date date = sdf.parse(dateStr);
            System.out.println("dateStr = " + date + " current time = " + new Date());
//            timer.scheduleAtFixedRate(task1, date, 2000);
            timer.scheduleAtFixedRate(task1, date, 2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
