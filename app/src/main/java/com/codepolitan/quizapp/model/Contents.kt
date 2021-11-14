package com.codepolitan.quizapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Contents(

	@field:SerializedName("contents")
	val contents: List<Content>? = null
) : Parcelable