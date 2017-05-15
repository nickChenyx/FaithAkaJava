package concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * CyclicBarrier 用来让一组线程互相等待，直至到达公共屏障点 （common barrier point）
 * 比如可以一组线程都要写文件，直到所有线程都完成写操作之后，再进行下面的工作
 * 两个 await() 方法，可以用来挂起当前线程
 * public int await() throws InterruptedException, BrokenBarrierException { };
 * public int await(long timeout, TimeUnit unit)throws InterruptedException,BrokenBarrierException,TimeoutException { };
 *
 * 参考：http://wosyingjun.iteye.com/blog/2299857
 * Created by nickChenyx on 2017/4/14.
 */
public class CyclicBarrierUsage {

    public static void main(String[] args) {
        int N = 4;
        CyclicBarrier barrier  = new CyclicBarrier(N);
        /**
         * 默认可以同步 4 组线程，
         * 但是可以以 4 的倍数添加，因为是Cyclic，所以释放等待线程后可以重复使用
         * 可以将这里的N 改为 8
         */
        for(int i=0;i<N;i++)
            new Writer(barrier).start();
    }

    static class Writer extends Thread{
        private CyclicBarrier cyclicBarrier;
        public Writer(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println("线程"+Thread.currentThread().getName()+"正在写入数据...");
            try {
                Thread.sleep(5000);//以睡眠来模拟写入数据操作
                System.out.println("线程"+Thread.currentThread().getName()+"写入数据完毕，等待其他线程写入完毕");
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch(BrokenBarrierException e){
                e.printStackTrace();
            }
            System.out.println("所有线程写入完毕，继续处理其他任务...");
        }
    }
}
