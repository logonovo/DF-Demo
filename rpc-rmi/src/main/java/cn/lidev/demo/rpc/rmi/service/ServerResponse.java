package cn.lidev.demo.rpc.rmi.service;

import java.io.Serializable;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2018/10/4 12:25
 */
public class ServerResponse<T>  implements Serializable {
    private int code;
    private String msg;
    private boolean successful;
    private T data;
    private ServerResponse(){

    }

    public static ServerResponse buildSuccess(){
        ServerResponse result = new ServerResponse();
        result.setSuccessful(true);
        result.setCode(0);
        result.setMsg("success");
        return result;
    }

    public static <T> ServerResponse<T> buildSuccess(T data){
        ServerResponse result = new ServerResponse();
        result.setSuccessful(true);
        result.setCode(0);
        result.setMsg("success");
        result.setData(data);
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}