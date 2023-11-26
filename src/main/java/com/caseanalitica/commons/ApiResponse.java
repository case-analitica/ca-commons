package com.caseanalitica.commons;

import java.util.List;

public class ApiResponse<T> {

    private Integer code;
    private String status;
    private String message;
    private Meta meta;
    private List<T> data;

    public ApiResponse() {
    }

    public ApiResponse(Integer code, String status, String message, Meta meta, List<T> data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.meta = meta;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }


}
