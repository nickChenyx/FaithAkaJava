package chapter6.singleton_5;

/**
 * @author nickChen
 * @create 2017-04-25 11:15.
 */
public class MyObject {
    private static MyObject myObject;
    private MyObject(){}

    /**
     * 延迟加载 懒汉模式 改进 2
     * 使用 DCL 双检查锁机制
     * Double Click Locking
     *
     * 现在对myObject 不为空的情况变成了异步。
     * 在创建时，采取小心策略。在锁内进行对象创建，并在锁内二次检查对象是否为空
     * @return
     */
    public static MyObject getInstance(){
        try {
            if (myObject!=null){
            }else {
                Thread.sleep(2000);
                synchronized (MyObject.class){
                    if (myObject==null){
                        myObject = new MyObject();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return myObject;
    }

}
