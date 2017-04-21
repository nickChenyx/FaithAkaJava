package chapter3.pipReaderWriter;


import java.io.PipedReader;

/**
 * @author nickChen
 * @create 2017-04-21 16:07.
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader input;

    public ThreadRead(ReadData read, PipedReader input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
