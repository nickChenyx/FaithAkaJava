package chapter2.t7;

/**
 * nosynchronize 部分交叉执行
 * synchronized 部分顺序执行！
 * @author nickChen
 * @create 2017-04-20 14:21.
 */
public class Task {
    public void doLongTimeTask(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("nosynchronized threadName="+Thread.currentThread().getName()+" i="+i);
        }
        System.out.println("");
        synchronized (this){
            for (int i = 0; i < 1000; i++) {
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+" i="+i);

            }
        }

    }

}
