package chapter3.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * @author nickChen
 * @create 2017-04-21 16:02.
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write:");
            for (int i = 0; i < 100; i++) {
                String outData = ""+(i+1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
