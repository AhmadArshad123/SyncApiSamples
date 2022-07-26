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
    private String districtCode;
    @SerializedName("division")
    @Expose
    private String division;
    @SerializedName("province_Id")
    @Expose
    private String provinceId;

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
    public District(String districtId, String districtName, String districtCode, String division, String provinceId) {
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

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String  provinceId) {
        this.provinceId = provinceId;
    }

}
