package chapter3.wait_notify_insert_test;

/**
 * @author nickChen
 * @create 2017-04-21 16:33.
 */
public class BackupA extends Thread {
    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
