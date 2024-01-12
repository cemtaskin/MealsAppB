package com.ttmobilpos.mealsappb.model.response

import com.google.gson.annotations.SerializedName

data class MealsCategoriesResponse (val categories : List<MealResponse> )

data class MealResponse (
    @SerializedName("idCategory")
    val id : String,
    @SerializedName("strCategory")
    val name : String,
    @SerializedName("strCategoryThumb")
    val imageUrl : String,
    @SerializedName("strCategoryDescription")
    val descrption: String,
    )

/*
{
      "idCategory": 1,
      "strCategory": "Beef",
      "strCategoryThumb": "https://www.themealdb.com/images/category/beef.png",
      "strCategoryDescription": "Beef is the culinary name for meat from cattle, particularly skeletal muscle. Humans have been eating beef since prehistoric times.[1] Beef is a source of high-quality protein and essential nutrients.[2]"
    }
 */