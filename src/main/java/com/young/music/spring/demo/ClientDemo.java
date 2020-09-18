package com.young.music.spring.demo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author yzx
 * create_time 2020/6/12
 */
public class ClientDemo {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        IHelloService helloService = (IHelloService) Naming.lookup("rmi://127.0.0.1/hello");
        System.out.println(helloService.sayHello("yzx"));
    }
}
