package com.example.samplesyncapi;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {

    @SerializedName("stats")
    @Expose
    private List<Stat> stats = null;
    @SerializedName("province")
    @Expose
    private List<Province> province = null;
    @SerializedName("districts")
    @Expose
    private List<District> districts = null;
    @SerializedName("tehsils")
    @Expose
    private List<Tehsil> tehsils = null;
    @SerializedName("unionCouncils")
    @Expose
    private List<UnionCouncil> unionCouncils = null;
    @SerializedName("villages")
    @Expose
    private List<Village> villages = null;
    @SerializedName("animals")
    @Expose
    private List<AnimalType> animalTypes = null;
    @SerializedName("species")
    @Expose
    private List<Species> species = null;
    @SerializedName("breeds")
    @Expose
    private List<Breed> breeds = null;
    @SerializedName("premesisTypes")
    @Expose
    private List<PremesisType> premesisTypes = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Data() {
    }

    /**
     *
     * @param province
     * @param villages
     * @param stats
     * @param species
     * @param districts
     * @param unionCouncils
     * @param animals
     * @param premesisTypes
     * @param tehsils
     * @param breeds
     */
    public Data(List<Stat> stats, List<Province> province, List<District> districts, List<Tehsil> tehsils, List<UnionCouncil> unionCouncils, List<Village> villages, List<AnimalType> animals, List<Species> species, List<Breed> breeds, List<PremesisType> premesisTypes) {
        super();
        this.stats = stats;
        this.province = province;
        this.districts = districts;
        this.tehsils = tehsils;
        this.unionCouncils = unionCouncils;
        this.villages = villages;
        this.animalTypes = animals;
        this.species = species;
        this.breeds = breeds;
        this.premesisTypes = premesisTypes;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public List<Province> getProvince() {
        return province;
    }

    public void setProvince(List<Province> province) {
        this.province = province;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public List<Tehsil> getTehsils() {
        return tehsils;
    }

    public void setTehsils(List<Tehsil> tehsils) {
        this.tehsils = tehsils;
    }

    public List<UnionCouncil> getUnionCouncils() {
        return unionCouncils;
    }

    public void setUnionCouncils(List<UnionCouncil> unionCouncils) {
        this.unionCouncils = unionCouncils;
    }

    public List<Village> getVillages() {
        return villages;
    }

    public void setVillages(List<Village> villages) {
        this.villages = villages;
    }

    public List<AnimalType> getAnimalsTypes() {
        return animalTypes;
    }

    public void setAnimalsTypes(List<AnimalType> animals) {
        this.animalTypes = animals;
    }

    public List<Species> getSpecies() {
        return species;
    }

    public void setSpecies(List<Species> species) {
        this.species = species;
    }

    public List<Breed> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<Breed> breeds) {
        this.breeds = breeds;
    }

    public List<PremesisType> getPremesisTypes() {
        return premesisTypes;
    }

    public void setPremesisTypes(List<PremesisType> premesisTypes) {
        this.premesisTypes = premesisTypes;
    }

}