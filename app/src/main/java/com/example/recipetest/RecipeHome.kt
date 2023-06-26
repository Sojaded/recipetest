package com.example.recipetest

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.recipetest.data.DataProvider
import com.example.recipetest.data.Meals

@Composable
fun RecipeHomeContent(navigateToProfile: (Meals) -> Unit) {
    val meals = remember { DataProvider.mealsList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = meals,
            itemContent = {
                MealsListItem(meals = it, navigateToProfile)
            }
        )
    }
}