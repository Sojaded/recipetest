package com.example.recipetest

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.ContentAlpha
import androidx.wear.compose.material.LocalContentAlpha
import com.example.recipetest.R.string.adopt_me
import com.example.recipetest.data.DataProvider
import com.example.recipetest.data.Meals
import com.example.recipetest.ui.theme.purple500

@Composable
fun ProfileScreen(meals: Meals, onNavIconPressed: () -> Unit = { }) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints(modifier = Modifier.weight(1f)) {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState),
                ) {
                    ProfileHeader(
                        scrollState,
                        meals,
                        this@BoxWithConstraints.maxHeight
                    )
                    ProfileContent(meals, this@BoxWithConstraints.maxHeight)
                }
            }
           ProfileContent(meals, this@BoxWithConstraints.maxHeight
            )
        }
    }
}

@Composable
private fun ProfileHeader(
    scrollState: ScrollState,
    meals: Meals,
    containerHeight: Dp
) {
    val offset = (scrollState.value / 2)
    val offsetDp = with(LocalDensity.current) { offset.toDp() }

    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth()
            .padding(top = offsetDp),
        painter = painterResource(id = meals.mealsImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun ProfileContent(meals: Meals, containerHeight: Dp) {
    Column {
        Spacer(modifier = Modifier.height(8.dp))

        Title(meals)

        ProfileProperty(stringResource(R.string.cookingInstruction), meals.cookingInstruction)

        ProfileProperty(stringResource(R.string.ingredients), meals.ingredients.toString())

        ProfileProperty(stringResource(R.string.description), meals.description)

        Spacer(Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))
    }
}

@Composable
private fun Title(
    meals: Meals
) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Title(
           meals: meals ,
            modifier = Modifier.baselineHeight(32.dp)
        )
    }
}

@Composable
private fun Title(meals: Meals, modifier: Modifier = Modifier) {
    Text(
        text = meals.title,
        modifier = modifier,
        style = MaterialTheme.typography.bodyMedium,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun ProfileProperty(label: String, value: String?, isLink: Boolean = false) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Divider()
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = label,
                modifier = Modifier.baselineHeight(24.dp),
                style = MaterialTheme.typography.bodySmall,
            )
        }
        Box (
            modifier = Modifier
                .height(30.dp)
                .verticalScroll(rememberScrollState())
        )

        Text(
            text = value,
            //modifier = Modifier.baselineHeight(24.dp),
            style =MaterialTheme.typography.bodySmall, overflow = TextOverflow.Visible
        )
    }
}
/*
@Preview
@Composable
fun ProfilePreview() {
    val meals = DataProvider.mealsList
    ProfileScreen(meals = meals )
}*/