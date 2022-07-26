package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Province {

    @SerializedName("province_Id")
    @Expose
    private String provinceId;
    @SerializedName("province_Name")
    @Expose
    private String provinceName;
    @SerializedName("province_Code")
    @Expose
    private Object provinceCode;
    @SerializedName("contry")
    @Expose
    private Object contry;

    /**
     * No args constructor for use in serialization
     *
     */
    public Province() {
    }

    /**
     *
     * @param provinceCode
     * @param contry
     * @param provinceName
     * @param provinceId
     */
    public Province(String provinceId, String provinceName, Object provinceCode, Object contry) {
        super();
        this.provinceId = provinceId;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
        this.contry = contry;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Object getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Object provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Object getContry() {
        return contry;
    }

    public void setContry(Object contry) {
        this.contry = contry;
    }

}