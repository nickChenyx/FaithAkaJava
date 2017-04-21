package chapter3.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * @author nickChen
 * @create 2017-04-21 16:06.
 */
public class ThreadWrite extends Thread{
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write, PipedOutputStream out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
