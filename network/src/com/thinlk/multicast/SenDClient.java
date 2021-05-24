package com.thinlk.multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class SenDClient {

    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        byte[] sp= "发送一个组播".getBytes();
        InetAddress address = InetAddress.getByName("224.0.1.224");
        DatagramPacket datagramPacket = new DatagramPacket(sp,sp.length,address,10000);

        datagramSocket.send(datagramPacket);

        datagramSocket.close();

    }
}
