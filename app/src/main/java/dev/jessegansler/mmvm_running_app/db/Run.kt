package dev.jessegansler.mmvm_running_app.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="running_table")
data class Run(
    var img: Bitmap? = null,
    // when; sort by date -> L
    var timestamp: Long = 0L,
    var avgSpeedInKMH: Float = 0f,
    var distanceInMeters: Int = 0,
    // how long; L easier conversion
    var timeInMillis: Long = 0L,
    var caloriesBurned: Int = 0

) {
    //handle primary key implicitly
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

}