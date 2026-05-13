package com.example.labscreensapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    // Визначаємо NavHost для керування навігацією між екранами
    NavHost(navController, startDestination = "list") {
        // Головний екран зі списком
        composable("list") {
            Scaffold(topBar = { MainTopAppBar() }) { padding ->
                Box(Modifier.padding(padding)) {
                    ItemList(onItemClick = { item ->
                        // Перехід на екран деталей з передачею ID
                        navController.navigate("details/${item.id}")
                    })
                }
            }
        }
        // Екран деталей (приймає параметр itemId)
        composable("details/{itemId}") { backStackEntry ->
            val itemId = backStackEntry.arguments?.getString("itemId")?.toIntOrNull()
            val item = sampleItems.find { it.id == itemId }
            if (item != null) {
                ItemDetailsScreen(item, onBack = { navController.popBackStack() })
            }
        }
    }
}
