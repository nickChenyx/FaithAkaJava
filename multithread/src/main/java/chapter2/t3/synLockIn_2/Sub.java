package chapter2.t3.synLockIn_2;

/**
 * 可重入锁可以在父子类继承环境中获得对象锁！
 * @author nickChen
 * @create 2017-04-20 13:27.
 */
public class Sub extends Main {
    @Override
    public synchronized void operateIMainMethod() {
        try {
            while(i>0){
                i--;
                System.out.println("sub print i="+i);
                Thread.sleep(100);
                super.operateIMainMethod();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
