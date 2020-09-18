package com.young.music.spring.demo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author yzx
 * create_time 2020/6/12
 */
public class ServerDemo {

    public static void main(String[] args) {
        try {
            IHelloService helloService = new HelloServiceImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://127.0.0.1/hello", helloService);
            System.out.println("服务启动成功");
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
