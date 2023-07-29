package com.example.bizlibottomnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bizlibottomnavigation.screens.CashFlowScreen
import com.example.bizlibottomnavigation.screens.MoreScreen
import com.example.bizlibottomnavigation.screens.ReportScreen
import com.example.bizlibottomnavigation.screens.SalesScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Reports.route)
    {
        composable(BottomBarScreen.Reports.route){
            ReportScreen()
        }


        composable(BottomBarScreen.Sales.route){
            SalesScreen()
        }


        composable(BottomBarScreen.CashFlow.route){
            CashFlowScreen()
        }


        composable(BottomBarScreen.More.route){
            MoreScreen()
        }

    }

}