package concurrent.wait_notify;

/**
 * 参考：http://ifeve.com/thread-signaling/
 * Created by nickChenyx on 2017/4/14.
 */
public class MyWaitNotify{
    MonitorObject myMonitorObject = new MonitorObject();

    public void doWait(){
        synchronized(myMonitorObject){
            try{
                System.out.println("monitor 挂起");
                myMonitorObject.wait();
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public void doNotify(){
        synchronized(myMonitorObject){
            myMonitorObject.notify();
            System.out.println("monitor notify");
        }
    }

}
