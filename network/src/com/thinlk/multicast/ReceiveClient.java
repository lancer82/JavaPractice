package com.thinlk.multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ReceiveClient {

    public static void main(String[] args) throws IOException {
        MulticastSocket multicastSocket = new MulticastSocket(10000);
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1024],1024);
        multicastSocket.joinGroup(InetAddress.getByName("224.0.1.224"));

        multicastSocket.receive(datagramPacket);

        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        multicastSocket.close();
    }
}
