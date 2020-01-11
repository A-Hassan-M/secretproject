package com.HAndN.spring_hibernate.models;

public class ResponseTemplate<T> {

    private T data;
    private String message;
    private int status;

    private ResponseTemplate(T data, String message, int status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }

    public static <T> ResponseTemplate<T> buildResponse(T data, String message, int status){
        return new ResponseTemplate<>(data, message, status);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}


