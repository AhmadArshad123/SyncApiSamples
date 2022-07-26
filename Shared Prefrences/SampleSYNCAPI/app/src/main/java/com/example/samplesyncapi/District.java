package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class District {

    @SerializedName("district_Id")
    @Expose
    private String districtId;
    @SerializedName("district_Name")
    @Expose
    private String districtName;
    @SerializedName("districtCode")
    @Expose
    private Object districtCode;
    @SerializedName("division")
    @Expose
    private Object division;
    @SerializedName("province_Id")
    @Expose
    private Object provinceId;

    /**
     * No args constructor for use in serialization
     *
     */
    public District() {
    }

    /**
     *
     * @param division
     * @param districtId
     * @param districtCode
     * @param districtName
     * @param provinceId
     */
    public District(String districtId, String districtName, Object districtCode, Object division, Object provinceId) {
        super();
        this.districtId = districtId;
        this.districtName = districtName;
        this.districtCode = districtCode;
        this.division = division;
        this.provinceId = provinceId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Object getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Object districtCode) {
        this.districtCode = districtCode;
    }

    public Object getDivision() {
        return division;
    }

    public void setDivision(Object division) {
        this.division = division;
    }

    public Object getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Object provinceId) {
        this.provinceId = provinceId;
    }

}
