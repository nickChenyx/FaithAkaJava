package chapter3.wait_notify_insert_test;

/**
 * A 和 B 轮流进行数据打印！
 * @author nickChen
 * @create 2017-04-21 16:34.
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB out = new BackupB(dbTools);
            out.start();
            BackupA input = new BackupA(dbTools);
            input.start();

        }
    }

}
