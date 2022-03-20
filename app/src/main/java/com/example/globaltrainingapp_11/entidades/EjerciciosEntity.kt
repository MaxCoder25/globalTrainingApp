package com.example.globaltrainingapp_11.entidades
import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity (tableName = "ejercicios")
@Serializable
@Parcelize
data class EjerciciosEntity (
    @PrimaryKey(autoGenerate = true)
    val id_ejercicios: Int = 0,
    val nombreEjercicio: String,
    val descripcion: String,
    val categoria: String,
    val nivel: String,
    val tipo_movimiento: String,
    val repeticiones: Int,
    val tieneTiempo: String,
    val imagen : String,
    val video: String
    ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id_ejercicios)
        parcel.writeString(nombreEjercicio)
        parcel.writeString(descripcion)
        parcel.writeString(categoria)
        parcel.writeString(nivel)
        parcel.writeString(tipo_movimiento)
        parcel.writeInt(repeticiones)
        parcel.writeString(tieneTiempo)
        parcel.writeString(imagen)
        parcel.writeString(video)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<EjerciciosEntity> {
        override fun createFromParcel(parcel: Parcel): EjerciciosEntity {
            return EjerciciosEntity(parcel)
        }

        override fun newArray(size: Int): Array<EjerciciosEntity?> {
            return arrayOfNulls(size)
        }
    }


}

annotation class Parcelize

