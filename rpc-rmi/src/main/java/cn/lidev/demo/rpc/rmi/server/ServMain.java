package cn.lidev.demo.rpc.rmi.server;

import cn.lidev.demo.rpc.rmi.service.HelloServiceImpl;
import cn.lidev.demo.rpc.rmi.service.IHelloService;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2018/10/4 11:50
 */
public class ServMain {
    public static void main(String[] args) throws Exception {
        IHelloService helloService = new HelloServiceImpl();
        LocateRegistry.createRegistry(8080);
        Naming.bind("rmi://localhost:8080/helloService", helloService);
        System.out.println("ServMain provicde RPC service now");
    }
}