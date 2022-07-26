package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Animal {

    @SerializedName("animal_Id")
    @Expose
    private String animalId;
    @SerializedName("animal_Type")
    @Expose
    private Object animalType;
    @SerializedName("animal_Status")
    @Expose
    private Object animalStatus;
    @SerializedName("animal_Color")
    @Expose
    private Object animalColor;

    /**
     * No args constructor for use in serialization
     *
     */
    public Animal() {
    }

    /**
     *
     * @param animalStatus
     * @param animalColor
     * @param animalType
     * @param animalId
     */
    public Animal(String animalId, Object animalType, Object animalStatus, Object animalColor) {
        super();
        this.animalId = animalId;
        this.animalType = animalType;
        this.animalStatus = animalStatus;
        this.animalColor = animalColor;
    }

    public String getAnimalId() {
        return animalId;
    }

    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }

    public Object getAnimalType() {
        return animalType;
    }

    public void setAnimalType(Object animalType) {
        this.animalType = animalType;
    }

    public Object getAnimalStatus() {
        return animalStatus;
    }

    public void setAnimalStatus(Object animalStatus) {
        this.animalStatus = animalStatus;
    }

    public Object getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(Object animalColor) {
        this.animalColor = animalColor;
    }

}