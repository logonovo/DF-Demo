package cn.lidev.demo.rpc.rmi.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2018/10/4 11:47
 */
public class HelloServiceImpl extends UnicastRemoteObject implements IHelloService {

    public HelloServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String str) throws RemoteException{
        return "hello,"+str;
    }
}