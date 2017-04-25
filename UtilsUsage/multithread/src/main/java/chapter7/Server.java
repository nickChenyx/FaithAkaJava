package chapter7;

/**
 * @author nickChen
 * @create 2017-04-25 13:18.
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

    public class Server {
        public static final int PORT = 12345;//监听的端口号

        public static void main(String[] args) {
            System.out.println("server run...");
            Server server = new Server();
            server.init();
        }

        public void init() {
            try {
                ServerSocket serverSocket = new ServerSocket(PORT);
                while (true) {
                    // 一旦有堵塞, 则表示服务器与客户端获得了连接
                    Socket client = serverSocket.accept();
                    try {
                        // 读取客户端数据
                        DataInputStream input = new DataInputStream(client.getInputStream());
                        String clientInputStr = input.readUTF();//这里要注意和客户端输出流的写方法对应,否则会抛 EOFException
                        // 处理客户端数据
                        System.out.println("from client:" + clientInputStr);

                        // 向客户端回复信息
                        DataOutputStream out = new DataOutputStream(client.getOutputStream());
                        out.writeUTF(clientInputStr);

                        out.close();
                        input.close();
                    } catch (Exception e) {
                        break;
                    } finally {
                        if (client != null) {
                            try {
                                client.close();
                            } catch (Exception e) {
                                client = null;
                                System.out.println("server finally exception:" + e.getMessage());
                            }
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("server error: " + e.getMessage());
            }
        }
    }
