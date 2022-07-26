package com.example.samplesyncapi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {


    public DBHelper(@Nullable Context context) {
        super(context, "SyncingData",null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String villagesTableQuery="CREATE TABLE VILLAGES( VillageID TEXT PRIMARY KEY, VillageName VARCHAR(255),VillageCode VARCHAR(255), UnionCouncilId VARCHAR(255) )";
        String specieTableQuery="CREATE TABLE SPECIES(SpecieId TEXT PRIMARY KEY, SpecieName VARCHAR(255), SpecieCode VARCHAR(255)) ";
        String breedTableQuery="CREATE TABLE BREEDS(BreedId TEXT PRIMARY KEY, BreedName VARCHAR(255), BreedCode VARCHAR(255) , SpecieId VARCHAR(255))";
        String premesisTypeTableQuery="CREATE TABLE PREMESISTYPES(PremesisId TEXT PRIMARY KEY, PremesisName VARCHAR(255))";
        String provincesTableQuery="CREATE TABLE PROVINCES(ProvinceId TEXT PRIMARY KEY, ProvinceName VARCHAR(255), ProvinceCode VARCHAR(255), Country VARCHAR(255))";
        String districtTableQuery="CREATE TABLE DISTRICTS(DistrictId TEXT PRIMARY KEY, DistrictName VARCHAR(255), DistrictCode VARCHAR(255), Division VARCHAR(255), ProvinceId VARCHAR(255))";
        String tehsilTableQuery="CREATE TABLE TEHSILS(TehsilId TEXT PRIMARY KEY, TehsilName VARCHAR(255), TehsilCode VARCHAR(255), DistrictId VARCHAR(255))";
        String unionCouncilTableQuery="CREATE TABLE UNIONCOUNCILS(UnionId TEXT PRIMARY KEY, UnionName VARCHAR(255), UnionCode VARCHAR(255), TehsilId VARCHAR(255))";
        String statTableQuery="CREATE TABLE STATS(NAme VARCHAR(255),Count VARCHAR(255))";
        sqLiteDatabase.execSQL(statTableQuery);
        sqLiteDatabase.execSQL(unionCouncilTableQuery);
        sqLiteDatabase.execSQL(tehsilTableQuery);
        sqLiteDatabase.execSQL(districtTableQuery);
        sqLiteDatabase.execSQL(provincesTableQuery);
        sqLiteDatabase.execSQL(premesisTypeTableQuery);
        sqLiteDatabase.execSQL(breedTableQuery);
        sqLiteDatabase.execSQL(specieTableQuery);
        sqLiteDatabase.execSQL(villagesTableQuery);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop Table if exists VILLAGES");
        sqLiteDatabase.execSQL("drop table if EXISTS SPECIES");
        sqLiteDatabase.execSQL("drop Table if EXISTS BREEDS");
        sqLiteDatabase.execSQL("drop Table if EXISTS PREMESISTYPES");
        sqLiteDatabase.execSQL("drop Table if EXISTS PROVINCES");
        sqLiteDatabase.execSQL("drop Table if EXISTS DISTRICTS");
        sqLiteDatabase.execSQL("drop Table if EXISTS TEHSILS");
        sqLiteDatabase.execSQL("drop Table if EXISTS UNIONCOUNCILS");
        sqLiteDatabase.execSQL("drop Table if EXISTS STATS");
    }


    public void addStats(String name, String count)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NAme", name);
        values.put("Count", count );
        db.insert("STATS", null, values);
    }

    public List<Stat> readStats()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM STATS", null);
        ArrayList<Stat> list=new ArrayList<>();
        String name;
        String count;
        if (cursor.moveToFirst()) {
            do {
                name=cursor.getString(0);
                count=cursor.getString(1);
                list.add(new Stat(name,count));
            } while (cursor.moveToNext());
        }
        return list;
    }

    public void addUnionCouncil(String unionId, String unionName, String unionCode, String tehsilId)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("UnionId", unionId);
        values.put("UnionName", unionName );
        values.put("UnionCode", unionCode);
        values.put("TehsilId", tehsilId);
        db.insert("UNIONCOUNCILS", null, values);
    }

    public List<UnionCouncil> readUnionCouncil()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM UNIONCOUNCILS", null);
        ArrayList<UnionCouncil> list=new ArrayList<>();
        String unionId;
        String unionName;
        String unionCode;
        String tehsilId;
        if (cursor.moveToFirst()) {
            do {
                unionId=cursor.getString(0);
                unionName=cursor.getString(1);
                unionCode= cursor.getString(2);
                tehsilId= cursor.getString(3);

                list.add(new UnionCouncil(unionId,unionName,unionCode, tehsilId));
            } while (cursor.moveToNext());
        }
        return list;
    }
    public void addTehsil(String tehsilId, String tehsilName, String tehsilCode, String districtId)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("TehsilId", tehsilId);
        values.put("TehsilName", tehsilName );
        values.put("TehsilCode", tehsilCode);
        values.put("DistrictId", districtId );
        db.insert("TEHSILS", null, values);
    }
    public List<Tehsil> readTehsil()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM TEHSILS", null);
        ArrayList<Tehsil> list=new ArrayList<>();
        String tehsilId;
        String tehsilName;
        String tehsilCode;
        String districtId;
        if (cursor.moveToFirst()) {
            do {
                tehsilId=cursor.getString(0);
                tehsilName=cursor.getString(1);
                tehsilCode= cursor.getString(2);
                districtId= cursor.getString(3);

                list.add(new Tehsil(tehsilId,tehsilName,tehsilCode, districtId));
            } while (cursor.moveToNext());
        }
        return list;
    }

    public void addDistricts(String districtId, String districtName, String districtCode, String division,String provinceId)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("DistrictId", districtId);
        values.put("DistrictName", districtName );
        values.put("DistrictCode", districtCode);
        values.put("DIVISION",division );
        values.put("ProvinceId", provinceId);
        db.insert("DISTRICTS", null, values);
    }
    public List<District> readDistricts()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM DISTRICTS", null);
        ArrayList<District> list=new ArrayList<>();
        String districtId;
        String districtName;
        String districtCode;
        String division;
        String provinceId;
        if (cursor.moveToFirst()) {
            do {
                districtId=cursor.getString(0);
                districtName=cursor.getString(1);
                districtCode= cursor.getString(2);
                division= cursor.getString(3);
                provinceId= cursor.getString(4);
                list.add(new District(districtId,districtName,districtCode, division, provinceId));
            } while (cursor.moveToNext());
        }
        return list;
    }



    public void addProvince(String provinceId, String provinceName, String provinceCode, String country)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("ProvinceId", provinceId);
        values.put("ProvinceName", provinceName );
        values.put("ProvinceCode", provinceCode);
        values.put("Country",country );
        db.insert("PROVINCES", null, values);
    }
    public List<Province> readProvince()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM PROVINCES", null);
        ArrayList<Province> list=new ArrayList<>();
        String provinceId;
        String provinceName;
        String provinceCode;
        String country;
        if (cursor.moveToFirst()) {
            do {
                provinceId=cursor.getString(0);
                provinceName=cursor.getString(1);
                provinceCode= cursor.getString(2);
                country= cursor.getString(3);

                list.add(new Province(provinceId,provinceName,provinceCode, country));
            } while (cursor.moveToNext());
        }
        return list;
    }
    public void addPremesisTypes(String premesisId, String premesisName)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("PremesisId", premesisId);
        values.put("PremesisName", premesisName );
        db.insert("PREMESISTYPES", null, values);
    }
    public List<PremesisType> readPremesis()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM PREMESISTYPES", null);
        ArrayList<PremesisType> list=new ArrayList<>();
        String premesisId;
        String premesisName;
        if (cursor.moveToFirst()) {
            do {
                premesisId=cursor.getString(0);
                premesisName=cursor.getString(1);
                list.add(new PremesisType(premesisId,premesisName));
            } while (cursor.moveToNext());
        }
        return list;
    }

    public void addBreed(String breedId, String breedName, String breedCode, String specieId)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("BreedId", breedId);
        values.put("BreedName", breedName );
        values.put("BreedCode", breedCode);
        values.put("SpecieId",specieId );
        db.insert("BREEDS", null, values);
    }
    public List<Breed> readBreeds()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM BREEDS", null);
        ArrayList<Breed> list=new ArrayList<>();
        String specieId;
        String breedName;
        String breedCode;
        String breedId;
        if (cursor.moveToFirst()) {
            do {
                breedId=cursor.getString(0);
                breedName=cursor.getString(1);
                breedCode= cursor.getString(2);
                specieId= cursor.getString(3);

                list.add(new Breed(breedId,breedName,breedCode, specieId));
            } while (cursor.moveToNext());
        }
        return list;
    }

    public void addSpecie(String specieId, String specieName, String specieCode)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("SpecieId",specieId );
        values.put("SpecieName", specieName );
        values.put("SpecieCode", specieCode);
        db.insert("SPECIES", null, values);
    }

    public List<Species> readSpecies()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM SPECIES", null);
        ArrayList<Species> specieList=new ArrayList<>();
        String specieID;
        String specieName;
        String specieCode;
        if (cursor.moveToFirst()) {
            do {
                specieID=cursor.getString(0);
                specieName=cursor.getString(1);
                specieCode= cursor.getString(2);

                specieList.add(new Species(specieID,specieName,specieCode));
            } while (cursor.moveToNext());

        }
        return specieList;
    }
    public void addVillages(String villageId, String villageName, String villageCode, String unionCouncilId)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
            values.put("VillageID",villageId );
            values.put("VillageName", villageName );
            values.put("VillageCode", villageCode);
            values.put("UnionCouncilId", unionCouncilId);
            db.insert("VILLAGES", null, values);

    }

    public List<Village> readVillages()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM VILLAGES", null);
        ArrayList<Village> villageList=new ArrayList<>();
        String villageID;
        String villageName;
        String villageCode;
        String ucId;
        if (cursor.moveToFirst()) {
            do {
                villageID=cursor.getString(0);
                villageName=cursor.getString(1);
                villageCode= cursor.getString(2);
                ucId=cursor.getString(3);

                villageList.add(new Village(villageID,villageName,villageCode,ucId));
            } while (cursor.moveToNext());

        }
        return villageList;
    }

    public void deleteStats()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("DELETE FROM STATS");
    }


    public void deleteUnionCouncils()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("DELETE FROM UNIONCOUNCILS");
    }

    public void deleteTehsils()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("DELETE FROM TEHSILS");
    }

    public void deleteDistricts()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("DELETE FROM DISTRICTS");
    }

    public void deleteProvince()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("DELETE FROM PROVINCES");
    }
    public void deleteSpecies()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("DELETE FROM SPECIES");
    }
    public void deletePremesisTypes()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("DELETE FROM PREMESISTYPES");
    }
    public void deleteBreeds()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("DELETE FROM BREEDS");
    }

    public void deleteVillages()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("DELETE FROM VILLAGES");
    }
}
