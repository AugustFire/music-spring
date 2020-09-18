package com.young.music.spring.demo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author yzx
 * create_time 2020/6/12
 */
public class HelloServiceImpl extends UnicastRemoteObject implements IHelloService{

    protected HelloServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String msg) throws RemoteException{
        return "hello" + msg;
    }
}
