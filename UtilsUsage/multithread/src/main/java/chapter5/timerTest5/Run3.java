package chapter5.timerTest5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer.scheduleAtFixedRate(task,date,period)
 * 如果开始的时间比当前时间晚，且出现没有出现延时的现象，下一次任务的开始时间
 * 是在上一次任务的开始时间之后 + period 时间。这个和 Timer.schedule 是一致的
 * 但是！ 如果开始的时间比当前时间早，程序即可开始运行，且 period 无效了！下一次任务
 * 的开始时间直接是上一次任务的结束时间，及时没有出现延时，period 的值在这里无效了！
 * （不属于无效 而是在填补 ( 当前时间 - 开始时间 ) 内，任务应该被执行的次数会被补上，
 * 而period 值就呈现了无效状态，因为当前在追赶任务进度，不会延时）
 * @author nickChen
 * @create 2017-04-25 9:27.
 */
public class Run3 {
    private static Timer timer = new Timer();
    private static int runCount = 0;
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1  begin running  time: " + new Date());
                Thread.sleep(2000);
                System.out.println("1    end running  time: " + new Date());
                runCount++;
                if (runCount == 15) {
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
            String dateStr = "2017-4-25 9:44:00";
            Date date = sdf.parse(dateStr);
            System.out.println("dateStr = "+date+" current time = "+new Date());
            timer.scheduleAtFixedRate(task1,date,5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
