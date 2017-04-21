package chapter3.pipReaderWriter;


import java.io.PipedReader;

/**
 * @author nickChen
 * @create 2017-04-21 16:04.
 */
public class ReadData {
    public void readMethod(PipedReader input) {
        try {
            System.out.println("read:");
            char[] charArray = new char[20];
            int readLength = input.read(charArray); // 这里阻塞，等待数据写入
            while (readLength!=-1){
                String newData = new String(charArray,0,readLength);
                System.out.print(newData);
                readLength = input.read(charArray);
            }
            System.out.println();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
