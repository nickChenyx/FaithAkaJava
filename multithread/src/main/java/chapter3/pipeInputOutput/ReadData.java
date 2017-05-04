package chapter3.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * @author nickChen
 * @create 2017-04-21 16:04.
 */
public class ReadData {
    public void readMethod(PipedInputStream input) {
        try {
            System.out.println("read:");
            byte[] byteArray = new byte[20];
            int readLength = input.read(byteArray); // 这里阻塞，等待数据写入
            while (readLength!=-1){
                String newData = new String(byteArray,0,readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
