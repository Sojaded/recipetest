package com.example.recipetest.data

import java.io.Serializable

data class Meals(
    val id: Int,
    val title: String,
    val cookingInstruction: String? =null,
    val ingredients: String,
    val description: String,
    val mealsImageId: Int= 0
) :Serializable