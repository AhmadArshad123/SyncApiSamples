package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;

public class Species extends SugarRecord {

    @SerializedName("specie_Id")
    @Expose
    private String specieId;
    @SerializedName("specie_Name")
    @Expose
    private String specieName;
    @SerializedName("specie_Code")
    @Expose
    private String specieCode;

    /**
     * No args constructor for use in serialization
     *
     */
    public Species() {
    }

    /**
     *
     * @param specieId
     * @param specieName
     * @param specieCode
     */
    public Species(String  specieId, String specieName, String specieCode) {
        super();
        this.specieId = specieId;
        this.specieName = specieName;
        this.specieCode = specieCode;
    }

    public String getSpecieId() {
        return specieId;
    }

    public void setSpecieId(String specieId) {
        this.specieId = specieId;
    }

    public String getSpecieName() {
        return specieName;
    }

    public void setSpecieName(String specieName) {
        this.specieName = specieName;
    }

    public String getSpecieCode() {
        return specieCode;
    }

    public void setSpecieCode(String specieCode) {
        this.specieCode = specieCode;
    }

}