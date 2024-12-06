/**
 * function:
 * author: suhsbeba
 * date: 2024/2/23 9:12
 */
package com.example.springboot2.Exception;


/**
 * 业务异常
 *
 */
public final class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误提示
     */
    private String message;

    /**
     * 错误明细，内部调试错误
     */
    private String detailMessage;

    /**
     * 空构造方法，避免反序列化问题
     */
    public ServiceException() {
    }

    public ServiceException(String message) {
        this.message = message;
    }

    public ServiceException(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
    public ServiceException(ExceptionCodeMsg exceptionCodeMsg) {
        this.message = exceptionCodeMsg.getMsg();
        this.code = exceptionCodeMsg.getCode();
    }
    public String getDetailMessage() {
        return detailMessage;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    public ServiceException setMessage(String message) {
        this.message = message;
        return this;
    }

    public ServiceException setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
        return this;
    }
}