package chapter3.waitOld;

/**
 *
 * @author nickChen
 * @create 2017-04-21 14:44.
 */
public class Subtract {
    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract() {
        try {
            synchronized (lock){
//                while (ValueObject.list.size()==0){
                if (ValueObject.list.size()==0){
                    System.out.println("wait begin = "+System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait  end  = "+System.currentTimeMillis());
                }
                ValueObject.list.remove(0);
                System.out.println("list size ="+ValueObject.list.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
