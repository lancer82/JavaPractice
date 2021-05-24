package com.thinlk.Inter;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInternetTest {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("LAPTOP-D7500NK7");

        String hostName = inetAddress.getHostName();
        System.out.println("我的主机名是"+hostName);
        String address = inetAddress.getHostAddress();
        System.out.println("我的ip地址是"+address);
    }
}
