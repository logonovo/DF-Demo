package cn.lidev.demo.rpc.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2018/10/4 11:47
 */
public interface IHelloService extends Remote{
    String sayHello(String str) throws RemoteException;
}