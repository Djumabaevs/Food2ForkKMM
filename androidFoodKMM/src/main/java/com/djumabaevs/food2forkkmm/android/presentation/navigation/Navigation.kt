package com.djumabaevs.food2forkkmm.android.presentation.navigation

import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.RecipeList.route) {
        composable(route = Screen.RecipeList.route) {navBackStackEntry ->
            Text("Recipe list screen")
            Divider()
            Button(onClick = { navController.navigate(Screen.RecipeDetail.route) }) {
                Text("Go recipe detail")
            }
        }
        composable(route = Screen.RecipeDetail.route) {navBackStackEntry ->
            Text(text = "Recipe detail screen")
        }
    }
}
