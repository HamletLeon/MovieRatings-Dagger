package com.hamletleon.movieratings.utils

import android.arch.persistence.room.TypeConverter
import com.google.gson.Gson
import javax.inject.Inject

class RoomUtils {
    @Inject lateinit var gson: Gson

    @TypeConverter
    fun <T> stringToList(obj: String, clazz: Class<Array<T>>): List<T> {
        val jsonToList: Array<T> = gson.fromJson(obj, clazz)
        return jsonToList.toList()
    }

    @TypeConverter
    fun <T> listToString(list: List<T>): String {
        return gson.toJson(list)
    }
}