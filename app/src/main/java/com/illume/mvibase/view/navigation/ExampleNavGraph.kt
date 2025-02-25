package com.illume.mvibase.view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.illume.mvibase.view.screen.Example2Route
import com.illume.mvibase.view.screen.ExampleRoute

@Composable
fun ExampleNavGraph(navController: NavHostController) {
    NavHost(
        // change startDestination to your intended start path
        navController = navController, startDestination = NavRoute.example.path
    ) {
        addExampleScreen(navController, this)

        addExample2Screen(navController, this)
    }

}

private fun addExampleScreen(
    navController: NavHostController, navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.example.path) {
        ExampleRoute(navigateToExample2 = {
            navController.navigate(NavRoute.example2.path)
        })
    }
}

private fun addExample2Screen(
    navController: NavHostController, navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.example2.path) {
        Example2Route(navigateToExample = {
            navController.navigate(NavRoute.example.path)},
            popBackStack = { navController.popBackStack() }
        )
    }
}