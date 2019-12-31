package cn.mirror6.network;

import java.net.*;
import java.util.Enumeration;
import java.util.List;

/**
 * @author mirror6
 * @description
 * @createTime 2019/12/31 16:25
 */
public class InetAddressExample {

    public static void main(String[] args) {

        // Get the network interfaces and associated addresses for this host
        try {
            //获取主机的网络接口
            Enumeration<NetworkInterface> interfaceList = NetworkInterface.getNetworkInterfaces();

            //判断列表是否为空。即使计算机没有联网，回环接口也会存在
            if (interfaceList == null) {
                System.out.println("--No interfaces found--");
            } else {

                while (interfaceList.hasMoreElements()) {

                    //输出接口名称
                    NetworkInterface face = interfaceList.nextElement();
                    System.out.println("Interface " + face.getName() + ":");

                    //输出接口地址
                    Enumeration<InetAddress> addrList = face.getInetAddresses();
                    if (!addrList.hasMoreElements()) {
                        System.out.println("\t(No addresses for this interface)");
                    }

                    while (addrList.hasMoreElements()) {
                        InetAddress address = addrList.nextElement();
                        System.out.print("\tAddress " + ((address instanceof Inet4Address ? "(v4)" : (address instanceof Inet6Address ? "(v6)" : "(?)"))));
                        System.out.println(": " + address.getHostAddress());
                    }
                }
            }
        } catch (SocketException se) {
            System.out.println("Error getting network interfaces:" + se.getMessage());
        }

        // Get name(s)/address(es) of hosts given on command line
        //获取从命令行输入的每个参数对应的主机名和地址
        for (String host : args) {
            try {
                System.out.println(host + ":");

                InetAddress[] addressList = InetAddress.getAllByName(host);

                for (InetAddress address : addressList) {
                    System.out.println("\t" + address.getHostName() + "/" + address.getHostAddress());
                }

            } catch (UnknownHostException e) {
                System.out.println("\tUnable to find address for " + host);
            }
        }

    }
}
