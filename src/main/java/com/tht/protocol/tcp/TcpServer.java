package com.tht.protocol.tcp;


import java.io.IOException;
import java.net.ServerSocket;

//创建一个tcp服务器
public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket  serverSocket=new ServerSocket(8888);
        System.out.println("Tcp服务器已启动，端口8888");

    }
}
