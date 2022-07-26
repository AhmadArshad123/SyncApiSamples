package com.example.samplesyncapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;

public class Breed extends SugarRecord {

    @SerializedName("breed_Id")
    @Expose
    private String breedId;
    @SerializedName("breed_Name")
    @Expose
    private String breedName;
    @SerializedName("breed_Code")
    @Expose
    private String breedCode;
    @SerializedName("specie_Id")
    @Expose
    private String specieId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Breed() {
    }

    /**
     *
     * @param breedName
     * @param breedId
     * @param breedCode
     * @param specieId
     */
    public Breed(String breedId, String breedName, String  breedCode, String specieId) {
        super();
        this.breedId = breedId;
        this.breedName = breedName;
        this.breedCode = breedCode;
        this.specieId = specieId;
    }

    public String getBreedId() {
        return breedId;
    }

    public void setBreedId(String breedId) {
        this.breedId = breedId;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public String getBreedCode() {
        return breedCode;
    }

    public void setBreedCode(String breedCode) {
        this.breedCode = breedCode;
    }

    public String  getSpecieId() {
        return specieId;
    }

    public void setSpecieId(String specieId) {
        this.specieId = specieId;
    }

}