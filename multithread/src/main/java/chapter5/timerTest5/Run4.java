package chapter5.timerTest5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * timer.scheduleAtFixedRate 如果上一次任务出现延时，则下一个任务会在上一个任务结束后即刻开始运行
 * @author nickChen
 * @create 2017-04-25 9:39.
 */
public class Run4 {
    private static Timer timer = new Timer();
    private static int runCount = 0;
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1  begin running  time: " + new Date());
                Thread.sleep(5000);
                System.out.println("1    end running  time: " + new Date());
                runCount++;
                if (runCount == 5) {
                    timer.cancel();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr = "2017-4-25 9:34:30";
            Date date = sdf.parse(dateStr);
            System.out.println("dateStr = " + date + " current time = " + new Date());
            timer.scheduleAtFixedRate(task1, date, 2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
