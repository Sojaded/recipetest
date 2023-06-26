package com.example.recipetest.data

import com.example.recipetest.R

object DataProvider {
    val mealsList= listOf(
        Meals(
            id= 2,
            title = "Meatballs",
            ingredients = 	"1 pound boneless\n"+
                "skinless chicken thighs cut into 1-inch pieces\n"+
                "3 ounces pork fat, or fatty bacon, diced\n"+
        "3 ounces crumbled fresh French breadcrumbs\n"+
    "⅓ cup sautéed onions (Optional)\n"+
    	"1 large egg, beaten\n"+
    "1 tablespoon white wine\n"+
    "3 cloves garlic, finely minced" +
                    "¼ cup chopped parsley\n"+
    "1 ½ teaspoons kosher salt\n"+
    "½ teaspoon freshly ground black pepper\n"+
    "¼ teaspoon chili flakes\n"+
    "¼ teaspoon fennel seeds, crushed\n"+
    "4 cups prepared tomato sauce (Optional)\n"+
    "olive oil or cooking spray for greasing baking sheet\n"
            description = "Easy to eat",
            mealsImageId = R.drawable.p1

        ),
        Meals(
            id= 1,
            title = "Meatballs",
            description = "Easy to eat",
            ingredients = "Cake:\n" +
                    "2 ½ cups flour\n" +
                    "•½ cup unsweetened cocoa powder\n" +
                    "1 teaspoon baking soda\n" +
                    "t½ teaspoon salt\n" +
                    "2 cups sugar\n" +
                    "1 cup butter, softened\n" +
                    "4 large eggs\n" +
                    "1 cup sour cream\n" +
                    "½ cup milk\n" +
                    "1 (1 ounce) bottle McCormick® Red Food Color\n" +
                    "•2 teaspoons McCormick® Pure Vanilla Extract\n" +
                    "Vanilla Cream Cheese Frosting:\n" +
                    "1 (8 ounce) package cream cheese, softened\n" +
                    "¼ cup butter, softened\n" +
                    "•2 tablespoons sour cream\n" +
                    "•2 teaspoons McCormick® Pure Vanilla Extract\n" +
                    "1 (16 ounce) box confectioners' sugar\n"+
                    "start cooking\n"

              mealsImageId = R.drawable.p2
        )
    )
}
