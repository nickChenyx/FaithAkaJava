package chapter3.pipeInputOutput;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 利用通道
 * PipedInputStream
 * PipedOutputStream
 * 完成线程间通信！
 * @author nickChen
 * @create 2017-04-21 16:08.
 */
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();
            //两者都可以是两个stream中产生通信，数据可以传输
            inputStream.connect(outputStream);
//            outputStream.connect(inputStream);
            ThreadRead threadRead = new ThreadRead(readData,inputStream);
            threadRead.start();
//            Thread.sleep(1);
            ThreadWrite threadWrite = new ThreadWrite(writeData,outputStream);
            threadWrite.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
