package chapter1.sec1.t4_threadsafe;

/**
 * 非线程安全，
 * 需要线程安全只需在 doPost 方法前加入 synchronized 关键字
 * @author nickChen
 * @create 2017-04-19 13:09.
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    public static void doPost(String username,String password){
        try {
            /**
             * if 进入睡眠状态，另一个线程主动进来，u:b,p:bb 打印出来后，
             * 此时A线程还没有结束，u:a,p:aa ，uRef:b,
             * 后赋值的 pRef:aa
             * 输出 b,aa
             */
            usernameRef = username;
            if (username.equals("a"))
                Thread.sleep(5000);
            passwordRef = password;
            System.out.println("username="+usernameRef+" password="+passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
