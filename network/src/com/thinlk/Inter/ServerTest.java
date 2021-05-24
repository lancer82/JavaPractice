package com.thinlk.Inter;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
注意;
先运行接收端，再运行发送端
接收端没有接受到数据会死等

 */
public class ServerTest {

    public static void main(String[] args) throws IOException {
        // 找发货人
        DatagramSocket ds = new DatagramSocket(10000);
        while (true) {
            // 自己提供箱子
            byte[] byt = new byte[1024];
            DatagramPacket dp = new DatagramPacket(byt,byt.length);
            // 接受礼物，把货放进箱子
            ds.receive(dp);
            // 从箱子里面拿货
            System.out.println(new String(dp.getData(),0,dp.getLength()));
        }
        //拿货走人
        //ds.close();
    }

}
