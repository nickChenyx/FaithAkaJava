package chapter3.wait_notify_insert_test;

/**
 * @author nickChen
 * @create 2017-04-21 16:33.
 */
public class BackupB extends Thread {
    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
