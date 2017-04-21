package chapter3.p_r_test;

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
                if (!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis() +"_"+System.nanoTime();
                System.out.println("set的值是:"+value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
