package chapter3.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * @author nickChen
 * @create 2017-04-21 16:07.
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
