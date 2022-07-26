package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class UnionCouncil {

    @SerializedName("union_Id")
    @Expose
    private String unionId;
    @SerializedName("union_Name")
    @Expose
    private String unionName;
    @SerializedName("union_Code")
    @Expose
    private Object unionCode;
    @SerializedName("tehsil_Id")
    @Expose
    private Object tehsilId;

    /**
     * No args constructor for use in serialization
     *
     */
    public UnionCouncil() {
    }

    /**
     *
     * @param tehsilId
     * @param unionCode
     * @param unionId
     * @param unionName
     */
    public UnionCouncil(String unionId, String unionName, Object unionCode, Object tehsilId) {
        super();
        this.unionId = unionId;
        this.unionName = unionName;
        this.unionCode = unionCode;
        this.tehsilId = tehsilId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUnionName() {
        return unionName;
    }

    public void setUnionName(String unionName) {
        this.unionName = unionName;
    }

    public Object getUnionCode() {
        return unionCode;
    }

    public void setUnionCode(Object unionCode) {
        this.unionCode = unionCode;
    }

    public Object getTehsilId() {
        return tehsilId;
    }

    public void setTehsilId(Object tehsilId) {
        this.tehsilId = tehsilId;
    }

}