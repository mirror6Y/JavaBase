package cn.mirror6.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @author mirror6
 * @description 通过 TCP 协议与回馈服务器（ echo server）进行通信的服务端。
 * @createTime 2020/1/3 11:43
 */
public class TcpEchoServer {

    /**
     * Size of receive buffer
     */
    private static final int BUFFERSIZE = 32;

    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            throw new IllegalArgumentException("Parameter(s): <Port>");
        }
        //服务器端口号
        int serverPort = Integer.parseInt(args[0]);
        //创建服务器端套接字并监听客户端的连接请求
        ServerSocket serverSocket = new ServerSocket(serverPort);
        int receiveSize;
        byte[] receiveBuffer = new byte[BUFFERSIZE];
        //处理新的连接请求
        while (true) {
            //连接客户端socket并接收信息
            Socket clientSocket = serverSocket.accept();
            //获取客户端地址
            SocketAddress clientAddress = clientSocket.getRemoteSocketAddress();
            System.out.println("Handling client at " + clientAddress);
            //获取客户端数据
            InputStream in = clientSocket.getInputStream();
            OutputStream out = clientSocket.getOutputStream();
            while ((receiveSize = in.read(receiveBuffer)) != -1) {
                out.write(receiveBuffer, 0, receiveSize);
            }
            //关闭连接，这个客户的单子  已完成
            clientSocket.close();
        }
    }

}
