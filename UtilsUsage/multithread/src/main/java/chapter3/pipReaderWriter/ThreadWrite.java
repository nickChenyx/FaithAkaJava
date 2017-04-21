package chapter3.pipReaderWriter;

import java.io.PipedWriter;

/**
 * @author nickChen
 * @create 2017-04-21 16:06.
 */
public class ThreadWrite extends Thread{
    private WriteData write;
    private PipedWriter out;

    public ThreadWrite(WriteData write, PipedWriter out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
