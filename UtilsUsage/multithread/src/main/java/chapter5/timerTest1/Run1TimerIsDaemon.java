package chapter5.timerTest1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * new Timer(true) 创建为守护线程！
 * 设置的时间如果在当前时间之前，则立即运行！
 * @author nickChen
 * @create 2017-04-24 15:37.
 */
public class Run1TimerIsDaemon {
    private static Timer timer = new Timer(true);
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！ 当前时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            Run1.MyTask task = new Run1.MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2016-4-24 15:40:00";
            Date date = sdf.parse(dateString);
            System.out.println("字符串时间："+date+" 当前时间为:"+new Date());
            timer.schedule(task,date);
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
