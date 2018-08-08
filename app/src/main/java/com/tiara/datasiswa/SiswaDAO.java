package com.tiara.datasiswa;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface SiswaDAO {

    @Query("SELECT * FROM SiswaModel ")
    List<SiswaModel> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void InsertAll(SiswaModel siswaModel);

    @Delete
    public void deleteUsers(SiswaModel siswaModel);

    @Update
    public void update(SiswaModel siswaModel);

}
