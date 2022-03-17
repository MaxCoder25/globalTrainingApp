package com.example.globaltrainingapp_11.entidades
import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable


@Entity(tableName = "rutinas")
@Serializable
@Parcelize
data class RutinasEntity (
    @PrimaryKey(autoGenerate = true)
    val id_rutinas: Int = 0,
    val nombre: String,
    val categoria: String,
    val nivel: String,
    val musculos: String,
    val tiempoMin: Int,
    val series: Int

    ): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id_rutinas)
        parcel.writeString(nombre)
        parcel.writeString(categoria)
        parcel.writeString(nivel)
        parcel.writeString(musculos)
        parcel.writeInt(tiempoMin)
        parcel.writeInt(series)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RutinasEntity> {
        override fun createFromParcel(parcel: Parcel): RutinasEntity {
            return RutinasEntity(parcel)
        }

        override fun newArray(size: Int): Array<RutinasEntity?> {
            return arrayOfNulls(size)
        }
    }


}
