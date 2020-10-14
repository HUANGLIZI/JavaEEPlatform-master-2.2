package cn.edu.xmu.restfuldemo.util;

import lombok.Data;

/**
 * 返回对象
 * @author Ming Qiu
 **/
@Data
public class ReturnObject<T> {

    /**
     * 错误号
     */
    Integer errno = 0;

    /**
     * 错误消息
     */
    String errmsg = "";

    /**
     * 返回值
     */
    private T data = null;

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
