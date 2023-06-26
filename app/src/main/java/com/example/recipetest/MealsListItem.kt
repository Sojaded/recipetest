package com.example.recipetest

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recipetest.data.DataProvider
import com.example.recipetest.data.Meals

@Composable
fun MealsListItem(meals: Meals ,navigateToProfile:(Meals)-> Unit,){
    Card( modifier =
        Modifier.padding(horizontal = 8.dp, vertical = 8.dp).fillMaxWidth(),
        RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = CardDefaults.cardElevation(defaultElevation =2.dp) ,

    ){

    Row(Modifier.clickable{ navigateToProfile(meals)}){
            MealsImage(meals)
        Column(
            modifier =  Modifier.padding(8.dp).fillMaxWidth().align(Alignment.CenterVertically)
        ) {
            Text(text = meals.title, style = typography.headlineLarge)
            Text(text = "view detail", style = typography.labelLarge)
             }
           }
        }
    }
@Composable
private fun MealsImage(meals: Meals){
    Image(
        painter = painterResource(id = meals.mealsImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.padding(8.dp).size(84.dp).clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}
@Preview
@Composable
fun PreviewMealsItem(){
    val meals = DataProvider.meals
    MealsListItem( meals = meals, navigateToProfile = {})
}