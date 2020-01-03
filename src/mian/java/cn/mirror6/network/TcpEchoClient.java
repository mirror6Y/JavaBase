package cn.mirror6.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

/**
 * @author mirror6
 * @description 通过 TCP 协议与回馈服务器（ echo server）进行通信的客户端。
 * @createTime 2020/1/2 8:57
 */
public class TcpEchoClient {

    public static void main(String[] args) throws IOException {

        //如果参数不为2和3则抛异常
        if (((args.length < 2) || (args.length > 3))) {
            throw new IllegalArgumentException("Parameter(s):<Server> <Word> [<Port>]");
        }
        //服务器ip或域名
        String server = args[0];
        //服务器端口
        int serverPort = (args.length == 3) ? Integer.parseInt(args[2]) : 7;
        //使用默认字符编码将参数String转为字节
        byte[] data = args[1].getBytes();

        //创建套接字
        Socket socket = new Socket(server, serverPort);
        System.out.println("Connected to server...sending echo string");

        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        out.write(data);
        //到目前为止收到的总字节数
        int totalBytesRcvd = 0;
        //上次读取的字节数
        int bytesRcvd;
        while (totalBytesRcvd < data.length) {
            if ((bytesRcvd = in.read(data, totalBytesRcvd, data.length - totalBytesRcvd)) == -1) {
                throw new SocketException("Connection closed prematurely");
            }
            totalBytesRcvd += bytesRcvd;
        } // data array is full

        System.out.println("Received: " + new String(data));
        //关闭套接字
        socket.close();
    }
}
