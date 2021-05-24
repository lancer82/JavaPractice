package com.thinlk.Inter;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UdpSendTest {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        DatagramSocket datagramSocket = new DatagramSocket();;
        while (true) {
            // 找快递公司
            String s = scanner.nextLine();
            if ("886".equals(s)) {
                break;
            }
            // 找货
            byte[] byt = s.getBytes();
            // 把货打包
            DatagramPacket dp = new DatagramPacket(byt,byt.length, InetAddress.getByName("127.0.0.1"),10000);
            // 发货
            datagramSocket.send(dp);
        }
        // 完活走人
        datagramSocket.close();
    }
}
