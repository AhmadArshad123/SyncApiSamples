package com.example.samplesyncapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Village {

    @SerializedName("village_Id")
    @Expose
    private String villageId;
    @SerializedName("village_Name")
    @Expose
    private String villageName;
    @SerializedName("village_Code")
    @Expose
    private Object villageCode;
    @SerializedName("union_Council_Id")
    @Expose
    private Object unionCouncilId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Village() {
    }

    /**
     *
     * @param unionCouncilId
     * @param villageName
     * @param villageId
     * @param villageCode
     */
    public Village(String villageId, String villageName, Object villageCode, Object unionCouncilId) {
        super();
        this.villageId = villageId;
        this.villageName = villageName;
        this.villageCode = villageCode;
        this.unionCouncilId = unionCouncilId;
    }

    public String getVillageId() {
        return villageId;
    }

    public void setVillageId(String villageId) {
        this.villageId = villageId;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public Object getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(Object villageCode) {
        this.villageCode = villageCode;
    }

    public Object getUnionCouncilId() {
        return unionCouncilId;
    }

    public void setUnionCouncilId(Object unionCouncilId) {
        this.unionCouncilId = unionCouncilId;
    }

}