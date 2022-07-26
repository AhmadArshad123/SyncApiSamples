package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PremesisType {

    @SerializedName("premType_Id")
    @Expose
    private String premTypeId;
    @SerializedName("premType_Name")
    @Expose
    private String premTypeName;

    /**
     * No args constructor for use in serialization
     *
     */
    public PremesisType() {
    }

    /**
     *
     * @param premTypeId
     * @param premTypeName
     */
    public PremesisType(String premTypeId, String premTypeName) {
        super();
        this.premTypeId = premTypeId;
        this.premTypeName = premTypeName;
    }

    public String getPremTypeId() {
        return premTypeId;
    }

    public void setPremTypeId(String premTypeId) {
        this.premTypeId = premTypeId;
    }

    public String getPremTypeName() {
        return premTypeName;
    }

    public void setPremTypeName(String premTypeName) {
        this.premTypeName = premTypeName;
    }

}