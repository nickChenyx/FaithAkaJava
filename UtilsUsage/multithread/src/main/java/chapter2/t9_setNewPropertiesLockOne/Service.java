package chapter2.t9_setNewPropertiesLockOne;


/**
 * 只要对象不变，对象的属性被改变，结果还是同步的
 * @author nickChen
 * @create 2017-04-21 8:58.
 */
public class Service {
    public void serviceMethodA(UserInfo userInfo){
        synchronized (userInfo){
            try {
                System.out.println(Thread.currentThread().getName());
                userInfo.setUsername("abc");//改变了对象属性，但是线程之间还是同步的
                Thread.sleep(3000);
                System.out.println("end !");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
