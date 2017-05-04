package chapter5.timerTest2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask.cancel() 方法可以将自身清除出任务队列！
 * 这里taskB在定期执行，taskA只执行了一次就被清除出了队列
 *
 * Timer.cancel 是将队列全部清空
 * @author nickChen
 * @create 2017-04-24 16:00.
 */
public class Run2 {
    static public class MyTaskA extends TimerTask{
        @Override
        public void run() {
            System.out.println("A 运行了！ 当前时间为："+ new Date());
            this.cancel();
        }
    }
    static public class MyTaskB extends TimerTask{
        @Override
        public void run() {
            System.out.println("B 运行了！ 当前时间为："+ new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTaskA taskA = new MyTaskA();
            MyTaskB taskB = new MyTaskB();
            SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr = "2017-4-24 16:51:00";
            Timer timer = new Timer();
            Date date = sdf.parse(dateStr);
            System.out.println("字符串时间："+date+" 当前时间："+new Date());
            timer.schedule(taskA,date,4000);
            timer.schedule(taskB,date,4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
