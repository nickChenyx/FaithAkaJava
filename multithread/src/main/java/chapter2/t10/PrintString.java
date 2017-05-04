package chapter2.t10;

/**
 * @author nickChen
 * @create 2017-04-21 9:29.
 */
public class PrintString implements Runnable {
    private boolean isContinuePrint=true;
    public boolean isContinuePrint(){
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }
    public void printStringMethod(){
        try {
            while(isContinuePrint == true){
                System.out.println("run printStringMethod threadName="+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
