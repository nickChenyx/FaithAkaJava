package chapter3.p_c_allWait;

/**
 * @author nickChen
 * @create 2017-04-21 14:58.
 */
public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock){
                while (!ValueObject.value.equals("")){
                    System.out.println("Product "+Thread.currentThread().getName()+" WAITING *");
                    lock.wait();
                }
                System.out.println("Product "+Thread.currentThread().getName()+" RUNNABLE #");
                String value = System.currentTimeMillis() +"_"+System.nanoTime();
                ValueObject.value = value;
//                lock.notify();
                lock.notifyAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
