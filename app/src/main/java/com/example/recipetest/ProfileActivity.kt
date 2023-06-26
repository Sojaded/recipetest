package com.example.recipetest

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.recipetest.data.Meals
import com.example.recipetest.ui.theme.RecipeTest

class ProfileActivity : AppCompatActivity() {

    private val meals:Meals by lazy {
        intent?.getSerializableExtra(MEALS_ID) as Meals
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeTest() {
                ProfileScreen(meals)
            }
        }
    }

    companion object {
        private const val MEALS_ID = "meals_id"
        fun newIntent(context: Context, meals: Meals) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(MEALS_ID, meals)
            }

        private fun putExtra(mealsId: String, meals: Meals) {

        }
    }
}