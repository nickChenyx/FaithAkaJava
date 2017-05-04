package chapter2.t9;

/**
 * @author nickChen
 * @create 2017-04-20 15:49.
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list,String data){
        try {
            //不上锁的话就会出现脏读现象，两个线程同时进入了add，这让本该只存一个对象的list存入了两个
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

}
