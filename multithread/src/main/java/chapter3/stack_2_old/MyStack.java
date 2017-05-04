package chapter3.stack_2_old;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nickChen
 * @create 2017-04-21 15:34.
 */
public class MyStack {
    private List list =new ArrayList();
    synchronized public void push() {
        try {
            // 将 if 判断改为 while 这样唤醒之后还要检测一下size大小，保证运行准确
            while (list.size()==1){
                this.wait();
            }
            list.add("anyString="+Math.random());
            this.notify();
            System.out.println("push="+list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    synchronized public String pop(){
        String  returnValue= "";
        try {
            // 将 if 判断改为 while 这样唤醒之后还要检测一下size大小，保证运行准确
            while (list.size()==0){
                System.out.println("pop 操作中的："+ Thread.currentThread().getName()+" 线程呈wait状态");
                this.wait();
            }
            returnValue = ""+list.get(0);
            list.remove(0);
            // 使用notifyAll唤醒所有线程，避免出现假死情况
            this.notifyAll();
            System.out.println("pop="+list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }

}
