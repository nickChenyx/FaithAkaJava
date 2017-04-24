package chapter5.timerTest1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author nickChen
 * @create 2017-04-24 15:31.
 */
public class Run1  {
    private static Timer timer = new Timer();
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！ 当前时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2017-4-24 15:36:00";
            Date date = sdf.parse(dateString);
            System.out.println("字符串时间："+date+" 当前时间为:"+new Date());
            timer.schedule(task,date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
