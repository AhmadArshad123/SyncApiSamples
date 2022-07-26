package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;


public class Province extends SugarRecord {

    @SerializedName("province_Id")
    @Expose
    private String provinceId;
    @SerializedName("province_Name")
    @Expose
    private String provinceName;
    @SerializedName("province_Code")
    @Expose
    private String provinceCode;
    @SerializedName("contry")
    @Expose
    private String contry;

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
    public Province(String provinceId, String provinceName, String provinceCode, String contry) {
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

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

}