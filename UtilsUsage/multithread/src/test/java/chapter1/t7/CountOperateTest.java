package chapter1.t7;

/**
 * isAlive 方法在将线程对象以构造参数的方式传入Thread对象进行start()启动时，是有差异的！
 * Thread.currentThread() 和 this 的isAlive返回上就有不同了
 * @author nickChen
 * @create 2017-04-19 13:51.
 */
public class CountOperateTest {
    public static void main(String[] args) throws Exception {
        CountOperate countOperate = new CountOperate();
//        Thread t1 = new Thread(countOperate);
//        System.out.println("main begin t1 isAlive = " + t1.isAlive());
//        t1.setName("A");
//        t1.start();
//        System.out.println("main end t1 isAlive = " + t1.isAlive());
        /**
         * 如果是自己启动的话 this.isAlive() 是 true 的
         * 如果是入参进入一个Thread（如上注释代码），则run中的isAlive显示的false
         */
        countOperate.start();

    }

}