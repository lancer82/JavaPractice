package com.thinlk.broadcast;

import java.io.IOException;
import java.net.*;

public class BroadcastClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte[] s = "发送一条广播".getBytes();
        InetAddress adr = InetAddress.getByName("255.255.255.255");
        DatagramPacket dp = new DatagramPacket(s,s.length,adr,10000);

        ds.send(dp);

        ds.close();
    }
}
