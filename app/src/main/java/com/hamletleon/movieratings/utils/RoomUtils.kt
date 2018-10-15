package com.hamletleon.movieratings.utils

import android.arch.persistence.room.TypeConverter
import com.google.gson.Gson
import javax.inject.Inject

class RoomUtils {
    @Inject lateinit var gson: Gson

    init {

    }

    @TypeConverter
    fun <T> stringToList(obj: String?, clazz: Class<Array<T>>): List<T> {
        if (obj == null) return emptyList()

        val jsonToList: Array<T> = Gson().fromJson(obj, clazz)
        return jsonToList.toList()
    }

    @TypeConverter
    fun <T> listToString(list: List<T>?): String {
        if (list == null) return ""
        return Gson().toJson(list)
    }
}