package com.example.recipetest.data

import com.example.recipetest.R

object DataProvider {
    val mealsList= listOf(
        Meals(
            id= 1,
            title = "Meatballs",
            cookingInstruction = "Lorem",
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
    "olive oil or cooking spray for greasing baking sheet\n",
            description = "Easy to eat",
            mealsImageId = R.drawable.p2

        ),

        Meals(
            id= 2,
            title = "Cupcakes",
            description = "Easy to cook",
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
                    "start cooking\n",
            cookingInstruction="lorem",

              mealsImageId = R.drawable.p1
        ),
        Meals(
            id = 3,
            title = "Healthy Air Fryer Parmesan Chicken with Broccoli",
            description = "This chicken gets incredibly crunchy, thanks to a light coating of panko and Parmesan and a quick cook in the air fryer! Serve it with charred broccoli and a tangy yogurt sauce for a healthy and complete meal you can throw together any day of the week.",
            ingredients = "1/3 cup panko\n" +
                    "\n" +
                    "1/4 cup finely grated Parmesan\n" +
                    "\n" +
                    "4 teaspoons olive oil\n" +
                    "\n" +
                    "1/2 teaspoon dried oregano\n" +
                    "\n" +
                    "Kosher salt and freshly ground black pepper\n" +
                    "\n" +
                    "2 small boneless, skinless chicken breasts (about 6 ounces each)\n" +
                    "\n" +
                    "1 1/2 tablespoons plus 1/4 teaspoon Dijon mustard\n" +
                    "\n" +
                    "2 cups small broccoli florets (about 5 ounces)\n" +
                    "\n" +
                    "1/4 cup low-fat plain yogurt\n" +
                    "\n" +
                    "Finely grated zest and juice of 1/2 lemon",
            cookingInstruction = "Lorem",
            mealsImageId = R.drawable.p3
        )
    )
}
