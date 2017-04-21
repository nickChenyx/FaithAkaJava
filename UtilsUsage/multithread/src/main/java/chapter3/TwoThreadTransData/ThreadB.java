package chapter3.TwoThreadTransData;

/**
 * @author nickChen
 * @create 2017-04-21 13:27.
 */
public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while(true){
                if (list.size()==5){
                    System.out.println("==5,Thread B exit!");
                    throw new InterruptedException();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
