package com.bcaf.inovative.data.api.methods

import com.bcaf.inovative.data.api.ApiClient
import com.bcaf.inovative.data.api.request.GetAllPost
import com.bcaf.inovative.data.api.request.LoginRequest
import com.bcaf.inovative.data.api.request.Post
import com.bcaf.inovative.data.api.request.Post2
import com.bcaf.inovative.data.api.request.User
import com.bcaf.inovative.data.api.response.LoginResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST


interface UserApi {

    @POST("/api/op/v1/gt")
    suspend fun loginUser(@Body loginRequest: LoginRequest): Response<LoginResponse>



    @GET("/api/post/v1/findall")
    suspend fun getAllPost(@Header("Authorization") authToken: String): Response<GetAllPost>

    // ... Fungsi-fungsi lain untuk API seperti createUser dan lainnya ...

    @POST("/api/op/v1/regis")
    suspend fun createUser(@Body user: User): Response<LoginResponse>

//    @POST("/api/post/v1/sv")
//    suspend fun createPost(@Body post: Post2): Response<LoginResponse>

    @POST("/api/post/v1/sv")
    suspend fun createPost(
        @Header("Authorization") token: String,
        @Body post: Post2
    ): Response<LoginResponse>




    companion object {
        fun getApi(): UserApi? {
            return ApiClient.client?.create(UserApi::class.java)
        }
    }
}