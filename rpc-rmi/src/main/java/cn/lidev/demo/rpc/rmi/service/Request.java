package cn.lidev.demo.rpc.rmi.service;

import java.io.Serializable;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2018/10/4 12:25
 */
public class Request implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}