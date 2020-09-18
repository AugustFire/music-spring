package com.young.music.spring.demo;

import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 * @author yzx
 * create_time 2020/6/11
 */

/**
 * java rmi
 */
public interface IHelloService extends Remote {

    String sayHello(String msg) throws RemoteException;

}
