package chapter2.t9_9;

/**
 * 可停止版本在 t10 中
 * @author nickChen
 * @create 2017-04-21 9:08.
 */
public class PrintString {
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
}
