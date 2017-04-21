package chapter3.waitOld;

/**
 * 这里有两个sub线程，会导致同时唤醒的时候移除了元素之后再继续移除元素，会出现indexoutofsize的错误
 * 要谨慎处理等待数据同步时，数据的实时的有效性
 * @author nickChen
 * @create 2017-04-21 14:48.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
        subtract1Thread.setName("subt1");
        subtract1Thread.start();
        ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
        subtract2Thread.setName("subt2");
        subtract2Thread.start();
        Thread.sleep(1000);
        ThreadAdd addThread = new ThreadAdd(add);
        addThread.start();
    }
}
