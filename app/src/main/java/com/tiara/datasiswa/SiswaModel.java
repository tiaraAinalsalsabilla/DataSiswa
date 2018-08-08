package com.tiara.datasiswa;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

//TODO 1 : kelas ini digunakan untuk membuat entity room database
@Entity
public class SiswaModel implements Parcelable {

    // TODO 2 : ini tu ibarat  klo di database apa aja yg mau di simpen di database buat tablenya
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo (name = "name")
    String name;

    @ColumnInfo(name = "address")
    String alamat;

    @ColumnInfo(name = "path_picture")
    String pathPicture;


    public SiswaModel(){

    }


    protected SiswaModel(Parcel in) {
        id = in.readInt();
        name = in.readString();
        alamat = in.readString();
        pathPicture = in.readString();
        //TODO 3 : setelah selesai ini di klik kanan -> pilih generate -> pilih getter and setter


    }

    public static final Creator<SiswaModel> CREATOR = new Creator<SiswaModel>() {
        @Override
        public SiswaModel createFromParcel(Parcel in) {
            return new SiswaModel(in);
        }

        @Override
        public SiswaModel[] newArray(int size) {
            return new SiswaModel[size];
        }
    };

    //TODO 4  : Ini fungsi untuk nge get dan nge set data dari database lokal
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPathPicture() {
        return pathPicture;
    }

    public void setPathPicture(String pathPicture) {
        this.pathPicture = pathPicture;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeString(alamat);
        parcel.writeString(pathPicture);
    }

}
