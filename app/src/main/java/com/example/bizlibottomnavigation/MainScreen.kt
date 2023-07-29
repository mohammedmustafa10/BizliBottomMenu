package com.example.bizlibottomnavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


@Composable
fun MainScreen() {

    val navController= rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navController)},
        content = {paddingValues ->
        Column(modifier = Modifier
            .padding(paddingValues = paddingValues)) {
            BottomNavGraph(navController =navController)
        }
    })

}

@Composable
fun BottomBar(navController: NavHostController) {

    val screens= listOf(
        BottomBarScreen.Reports,
        BottomBarScreen.Sales,
        BottomBarScreen.CashFlow,
        BottomBarScreen.More
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination= navBackStackEntry?.destination

    BottomNavigation {
        screens.forEach { screen->
            AddItem(screen = screen,
                currentDestination = currentDestination,
                navController = navController)

        }
    }
}

@Composable
fun RowScope.AddItem(screen: BottomBarScreen,
                     currentDestination: NavDestination?,
                     navController: NavHostController
) {

    BottomNavigationItem(
        label = {
            Text(text = screen.title)
        },
        icon = { Icon(painter = painterResource(id = screen.icon),
            contentDescription = "Navigation Icon")},
        selected = currentDestination?.hierarchy?.any {
            it.route== screen.route
        } == true,
        onClick = {navController.navigate(screen.route)}
    )
}

