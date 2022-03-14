package com.example.globaltrainingapp_11.entidades

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable


@Entity(tableName = "semana_rutinas")
@Serializable
@Parcelize
data class SemanaRutinasEntity(
    @PrimaryKey (autoGenerate = false)
    val dia: String,
    val id_rutinas: Int

): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(dia)
        parcel.writeInt(id_rutinas)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SemanaRutinasEntity> {
        override fun createFromParcel(parcel: Parcel): SemanaRutinasEntity {
            return SemanaRutinasEntity(parcel)
        }

        override fun newArray(size: Int): Array<SemanaRutinasEntity?> {
            return arrayOfNulls(size)
        }
    }

}