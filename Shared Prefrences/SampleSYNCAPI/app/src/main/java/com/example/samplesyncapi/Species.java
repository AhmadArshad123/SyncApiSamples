package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Species {

    @SerializedName("specie_Id")
    @Expose
    private Object specieId;
    @SerializedName("specie_Name")
    @Expose
    private String specieName;
    @SerializedName("specie_Code")
    @Expose
    private Object specieCode;

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
    public Species(Object specieId, String specieName, Object specieCode) {
        super();
        this.specieId = specieId;
        this.specieName = specieName;
        this.specieCode = specieCode;
    }

    public Object getSpecieId() {
        return specieId;
    }

    public void setSpecieId(Object specieId) {
        this.specieId = specieId;
    }

    public String getSpecieName() {
        return specieName;
    }

    public void setSpecieName(String specieName) {
        this.specieName = specieName;
    }

    public Object getSpecieCode() {
        return specieCode;
    }

    public void setSpecieCode(Object specieCode) {
        this.specieCode = specieCode;
    }

}