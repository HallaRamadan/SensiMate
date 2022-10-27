
package com.example.sensimate

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sensimate.ui.screens.Discover
import com.example.sensimate.ui.screens.Discover_DetailPreview
import com.example.sensimate.ui.screens.MyEvent


@Composable

fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route

    ) {
        composable(route = BottomBarScreen.Home.route) {
            MyEvent()
        }
        composable(route = BottomBarScreen.Profile.route) {
            Discover_DetailPreview()
        }
        composable(route = BottomBarScreen.Discover.route) {
            Discover()
        }

    }






        }


