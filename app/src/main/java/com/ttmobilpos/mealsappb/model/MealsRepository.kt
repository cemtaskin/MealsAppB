package com.ttmobilpos.mealsappb.model

import com.ttmobilpos.mealsappb.model.api.MealsWebService
import com.ttmobilpos.mealsappb.model.response.MealsCategoriesResponse

class MealsRepository (private val webService : MealsWebService = MealsWebService()) {
    suspend fun getMeals () : MealsCategoriesResponse{
        return webService.getCategories()
    }
}