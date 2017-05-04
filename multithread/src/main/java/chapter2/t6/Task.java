package chapter2.t6;

/**
 * synchronized  代码块的合理使用，有效的加速了程序执行！
 * @author nickChen
 * @create 2017-04-20 13:55.
 */
public class Task {
    private String data1;
    private String data2;
    public  void doLongTimeTask(){
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            String data1 = "长时间运行。。。。返回值1"+Thread.currentThread().getName();
            String data2 = "长时间运行。。。。返回值2"+Thread.currentThread().getName();
            synchronized (this){
                this.data1 = data1;
                this.data2 = data2;
            }
            System.out.println(data1);
            System.out.println(data2);
            System.out.println("end task");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
