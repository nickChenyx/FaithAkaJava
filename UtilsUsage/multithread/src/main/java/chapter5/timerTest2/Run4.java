package chapter5.timerTest2;

import chapter3.stack_1.P;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * timer.cancel  有的时候没有争抢到queue锁，所以TimerTask中的任务正常执行
 * @author nickChen
 * @create 2017-04-24 17:19.
 */
public class Run4 {
    static int i=0;
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("run: "+i);
        }
    }

    public static void main(String[] args) {
        while (true){
            try {
                i++;
                Timer timer  = new Timer();
                MyTask task = new MyTask();
                SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dateStr = "2017-4-24 17:16:00";
                Date date = sdf.parse(dateStr);
                timer.schedule(task,date);
                timer.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
