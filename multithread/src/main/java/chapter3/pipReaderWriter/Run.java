package chapter3.pipReaderWriter;


import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 利用通道
 * PipedReader
 * PipedWriter
 * 完成线程间通信！
 * @author nickChen
 * @create 2017-04-21 16:08.
 */
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedReader pipedReader = new PipedReader();
            PipedWriter pipedWriter = new PipedWriter();
            //两者都可以是两个stream中产生通信，数据可以传输
            pipedReader.connect(pipedWriter);
//            outputStream.connect(inputStream);
            ThreadRead threadRead = new ThreadRead(readData,pipedReader);
            threadRead.start();
//            Thread.sleep(1);
            ThreadWrite threadWrite = new ThreadWrite(writeData,pipedWriter);
            threadWrite.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
