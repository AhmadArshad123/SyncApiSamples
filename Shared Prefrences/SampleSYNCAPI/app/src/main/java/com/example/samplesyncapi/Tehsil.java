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
    private Object tehsilCode;
    @SerializedName("district_Id")
    @Expose
    private Object districtId;

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
    public Tehsil(String tehsilId, String tehsilName, Object tehsilCode, Object districtId) {
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

    public Object getTehsilCode() {
        return tehsilCode;
    }

    public void setTehsilCode(Object tehsilCode) {
        this.tehsilCode = tehsilCode;
    }

    public Object getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Object districtId) {
        this.districtId = districtId;
    }

}