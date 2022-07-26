package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;


public class UnionCouncil extends SugarRecord {

    @SerializedName("union_Id")
    @Expose
    private String unionId;
    @SerializedName("union_Name")
    @Expose
    private String unionName;
    @SerializedName("union_Code")
    @Expose
    private String unionCode;
    @SerializedName("tehsil_Id")
    @Expose
    private String tehsilId;

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
    public UnionCouncil(String unionId, String unionName, String unionCode, String tehsilId) {
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

    public String getUnionCode() {
        return unionCode;
    }

    public void setUnionCode(String unionCode) {
        this.unionCode = unionCode;
    }

    public String  getTehsilId() {
        return tehsilId;
    }

    public void setTehsilId(String  tehsilId) {
        this.tehsilId = tehsilId;
    }

}