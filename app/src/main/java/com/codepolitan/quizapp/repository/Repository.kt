package com.codepolitan.quizapp.repository

import android.content.Context
import com.codepolitan.quizapp.model.Content
import com.codepolitan.quizapp.model.Contents
import com.google.gson.Gson
import java.io.IOException

object Repository {
  fun getDataContents(context: Context?): List<Content>? {
    val json: String?
    try {
      val inputStream = context?.assets?.open("json/contents.json")
      json = inputStream?.bufferedReader().use { it?.readText() }
    } catch (e: IOException) {
      return null
    }
    val contents = Gson().fromJson(json, Contents::class.java)
    return contents.contents
  }
}