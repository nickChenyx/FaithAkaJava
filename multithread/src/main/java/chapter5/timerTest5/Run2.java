package chapter5.timerTest5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer.schedule() 如果上一个任务执行延时，则下一个任务的执行时间就是上一次的“结束”时间
 * 比如上一次是从9点10分开始的，period是1分钟，在没有延时的情况下，比如执行固定需要2分钟左右
 * 那第一次开始就是 9点10分，结束在9点12分，下一次开始就是9点12分。
 * @author nickChen
 * @create 2017-04-25 9:23.
 */
public class Run2 {
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
            String dateStr = "2017-4-25 9:21:30";
            Date date = sdf.parse(dateStr);
            System.out.println("dateStr = "+date+" current time = "+new Date());
            timer.schedule(task1,date,2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
