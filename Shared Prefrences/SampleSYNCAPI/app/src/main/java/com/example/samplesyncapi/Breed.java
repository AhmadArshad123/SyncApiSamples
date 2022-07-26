package com.example.samplesyncapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Breed {

    @SerializedName("breed_Id")
    @Expose
    private String breedId;
    @SerializedName("breed_Name")
    @Expose
    private String breedName;
    @SerializedName("breed_Code")
    @Expose
    private Object breedCode;
    @SerializedName("specie_Id")
    @Expose
    private Object specieId;

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
    public Breed(String breedId, String breedName, Object breedCode, Object specieId) {
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

    public Object getBreedCode() {
        return breedCode;
    }

    public void setBreedCode(Object breedCode) {
        this.breedCode = breedCode;
    }

    public Object getSpecieId() {
        return specieId;
    }

    public void setSpecieId(Object specieId) {
        this.specieId = specieId;
    }

}