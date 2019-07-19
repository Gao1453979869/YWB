package com.ywb.common.vo;

import com.ywb.common.config.ResultJson_Config;

public class R<T> {
    public int code;
    public String msg;
    public T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public R(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public R() {
    }

    public static <T> R setOK(String msg,T obj){
        R r = new R(ResultJson_Config.Ok,msg);
        r.setData(obj);
        return r;
    }

    public static <T> R setERROR(String msg,T obj){
        R r = new R(ResultJson_Config.ERROR,msg);
        r.setData(obj);
        return r;
    }

    public static <T> R setR(boolean issuccess, String msg,T obj){
        R r;
        if (issuccess){
            r = new R(ResultJson_Config.Ok, msg);
        }else {
            r = new R(ResultJson_Config.ERROR, msg);
        }

        r.setData(obj);
        return  r;
    }

}
