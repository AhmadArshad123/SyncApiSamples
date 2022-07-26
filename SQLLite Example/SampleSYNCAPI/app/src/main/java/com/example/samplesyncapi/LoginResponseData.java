package com.example.samplesyncapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponseData {
    @SerializedName("user_Id")
    @Expose
    private Integer userId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("expiry")
    @Expose
    private String expiry;

    /**
     * No args constructor for use in serialization
     *
     */
    public LoginResponseData() {
    }

    /**
     *
     * @param password
     * @param name
     * @param expiry
     * @param userName
     * @param userId
     * @param token
     */
    public LoginResponseData(Integer userId, String name, String userName, String password, String token, String expiry) {
        super();
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.token = token;
        this.expiry = expiry;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
}
