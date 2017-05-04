package chapter2.t16_synchronizedUpdateNewValue;

/**
 * @author nickChen
 * @create 2017-04-21 11:39.
 */
public class Service {
    private boolean isContinueRun = true;
    public void runMethod(){
        String anyStr = new String();
        while (isContinueRun){
            /**
             * 这里示了一个非常有用的功能
             * 如果不加这一句，那么运行便会锁死，因为isContinueRun的修改不可见（共有堆栈和私有堆栈）
             * 但是synchronized可以保证进入同步方法或者块的每个线程，都可以看到由同一个锁保护之前所有的修改效果！
             */
            //synchronized (anyStr){}

        }
        System.out.println(Thread.currentThread().getName()+"runMethod() 已经停止");
    }
    public void stopMethod(){
        isContinueRun = false;
    }

}
