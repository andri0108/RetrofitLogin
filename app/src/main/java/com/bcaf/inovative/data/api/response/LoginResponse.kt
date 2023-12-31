package com.bcaf.inovative.data.api.response



import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @field:SerializedName("data")
    var data: Data,

    @field:SerializedName("success")
    val success: Boolean? = null,

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("status")
    val status: Int? = null,

    @field:SerializedName("timestamp")
    val timestamp: String? = null
)
data class Data(
    @field:SerializedName("token")
    val token: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

)
