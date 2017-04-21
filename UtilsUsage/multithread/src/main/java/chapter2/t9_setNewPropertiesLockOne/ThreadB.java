package chapter2.t9_setNewPropertiesLockOne;

/**
 * @author nickChen
 * @create 2017-04-21 9:01.
 */
public class ThreadB extends Thread {
    private Service service;
    private UserInfo userInfo;

    public ThreadB(Service service, UserInfo userInfo) {
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userInfo);
    }
}
