package com.example.samplesyncapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("data")
    @Expose
    private LoginResponseData data;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("success")
    @Expose
    private Boolean success;
    public LoginResponse(LoginResponseData data, Integer code, String message, Boolean success) {
        super();
        this.data = data;
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public LoginResponseData getData() {
        return data;
    }

    public void setData(LoginResponseData data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
