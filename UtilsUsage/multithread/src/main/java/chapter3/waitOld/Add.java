package chapter3.waitOld;

/**
 * @author nickChen
 * @create 2017-04-21 14:42.
 */
public class Add {
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add() {
        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }

    }
}
