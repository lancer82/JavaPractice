package com.thinlk.broadcast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReveiveClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);

        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);

        ds.receive(dp);

        System.out.println(new String(dp.getData(),0,dp.getLength()));

        ds.close();
    }
}
