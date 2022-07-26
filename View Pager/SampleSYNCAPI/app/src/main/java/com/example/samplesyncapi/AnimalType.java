package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnimalType {

    @SerializedName("animalType_Id")
    @Expose
    private Integer animalTypeId;
    @SerializedName("animalType_Name")
    @Expose
    private Object animalTypeName;

    /**
     * No args constructor for use in serialization
     *
     */
    public AnimalType() {
    }

    /**
     *
     * @param animalTypeName
     * @param animalTypeId
     */
    public AnimalType(Integer animalTypeId, Object animalTypeName) {
        super();
        this.animalTypeId = animalTypeId;
        this.animalTypeName = animalTypeName;
    }

    public Integer getAnimalTypeId() {
        return animalTypeId;
    }

    public void setAnimalTypeId(Integer animalTypeId) {
        this.animalTypeId = animalTypeId;
    }

    public Object getAnimalTypeName() {
        return animalTypeName;
    }

    public void setAnimalTypeName(Object animalTypeName) {
        this.animalTypeName = animalTypeName;
    }
}