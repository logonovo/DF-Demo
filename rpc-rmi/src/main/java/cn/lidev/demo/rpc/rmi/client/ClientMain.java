package cn.lidev.demo.rpc.rmi.client;

import cn.lidev.demo.rpc.rmi.service.IHelloService;
import cn.lidev.demo.rpc.rmi.service.Request;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2018/10/4 11:57
 */
public class ClientMain {
    public static void main(String[] args) throws Exception {
        IHelloService helloService = (IHelloService) Naming.lookup("rmi://localhost:8080/helloService");
        System.out.println("RMI响应:"+helloService.sayHello("jack"));

        Request request = new Request();
        request.setName("lucy");
        System.out.println("RMI响应:"+helloService.sayHello(request).getData());

    }
}