package com.ttmobilpos.mealsappb.model.api

import com.ttmobilpos.mealsappb.model.response.MealsCategoriesResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


class MealsWebService {

    private lateinit var api : MealsApi

    init{
       var refrofit = Retrofit.Builder()
           .baseUrl("https://www.themealdb.com/api/json/v1/1/")
           .addConverterFactory(GsonConverterFactory.create())
           .build()
        api = refrofit.create(MealsApi::class.java)
    }

    suspend fun getCategories () : MealsCategoriesResponse {
        return api.getCategories()
    }


    interface MealsApi{
        @GET("categories.php")
        suspend fun getCategories(): MealsCategoriesResponse
    }
}