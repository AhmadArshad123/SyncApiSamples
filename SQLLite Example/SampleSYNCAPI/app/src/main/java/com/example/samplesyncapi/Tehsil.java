package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tehsil {

    @SerializedName("tehsil_Id")
    @Expose
    private String tehsilId;
    @SerializedName("tehsil_Name")
    @Expose
    private String tehsilName;
    @SerializedName("tehsil_Code")
    @Expose
    private String tehsilCode;
    @SerializedName("district_Id")
    @Expose
    private String districtId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Tehsil() {
    }

    /**
     *
     * @param tehsilCode
     * @param tehsilId
     * @param districtId
     * @param tehsilName
     */
    public Tehsil(String tehsilId, String tehsilName, String tehsilCode, String districtId) {
        super();
        this.tehsilId = tehsilId;
        this.tehsilName = tehsilName;
        this.tehsilCode = tehsilCode;
        this.districtId = districtId;
    }

    public String getTehsilId() {
        return tehsilId;
    }

    public void setTehsilId(String tehsilId) {
        this.tehsilId = tehsilId;
    }

    public String getTehsilName() {
        return tehsilName;
    }

    public void setTehsilName(String tehsilName) {
        this.tehsilName = tehsilName;
    }

    public String getTehsilCode() {
        return tehsilCode;
    }

    public void setTehsilCode(String tehsilCode) {
        this.tehsilCode = tehsilCode;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

}