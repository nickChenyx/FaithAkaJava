package chapter5.timerTest5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer.schedule() 如果没有延时的情况下，下一次执行时间参考的是上一次任务的“开始”时间
 * 比如上一次是从9点10分开始的，period是1分钟，在没有延时的情况下，比如执行固定需要10s左右
 * 那第一次开始就是 9点10分，下一次开始就是9点11分。
 * @author nickChen
 * @create 2017-04-25 9:14.
 */
public class Run1 {
    private  static  Timer timer = new Timer();
    private static int runCount=0;
    static public class MyTask1 extends TimerTask{
        @Override
        public void run() {
            try {
                System.out.println("1  begin running  time: "+new Date());
                Thread.sleep(1000);
                System.out.println("1    end running  time: "+new Date());
                runCount++;
                if (runCount==5){
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
            timer.schedule(task1,date,3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
