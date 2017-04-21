package chapter3.p_c_allWait;



/**
 * @author nickChen
 * @create 2017-04-21 15:02.
 */
public class C {
    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock){
                while (ValueObject.value.equals("")){
                    System.out.println("Custom "+Thread.currentThread().getName()+" WAITING *");
                    lock.wait();
                }
                System.out.println("Custom "+Thread.currentThread().getName()+" RUNNABLE #");
                ValueObject.value="";
//                lock.notify();
                lock.notifyAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
