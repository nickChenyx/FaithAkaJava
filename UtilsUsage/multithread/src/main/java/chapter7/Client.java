package chapter7;

/**
 * @author nickChen
 * @create 2017-04-25 13:19.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static final String IP_ADDR = "localhost";//服务器地址
    public static final int PORT = 12345;//服务器端口号

    public static void main(String[] args) {
        System.out.println("client run...");
        while (true) {
            Socket socket = null;
            try {
                //创建一个流套接字并将其连接到指定主机上的指定端口号
                socket = new Socket(IP_ADDR, PORT);

                //读取服务器端数据
                DataInputStream input = new DataInputStream(socket.getInputStream());
                //向服务器端发送数据
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                System.out.print("$input: ");
                String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
                out.writeUTF(str);

                //将服务器发过来的数据打印在客户端的console上
                String res = input.readUTF();
                System.out.println(res);

                //关闭流
                out.close();
                input.close();
            } catch (Exception e) {
                System.out.println("client exception:" + e.getMessage());
            } finally {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        socket = null;
                        System.out.println("client finally exception:" + e.getMessage());
                    }
                }
            }
        }
    }
}