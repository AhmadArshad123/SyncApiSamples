package com.example.samplesyncapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;


public class Stat extends SugarRecord {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("count")
    @Expose
    private String count;

    /**
     * No args constructor for use in serialization
     *
     */
    public Stat() {
    }

    /**
     *
     * @param name
     * @param count
     */
    public Stat(String name, String count) {
        super();
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

}