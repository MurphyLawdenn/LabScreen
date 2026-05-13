package com.example.labscreensapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopAppBar() {
    CenterAlignedTopAppBar(
        title = { Text("LabScreensApp") },
        navigationIcon = {
            IconButton(onClick = { /* TODO: Open drawer or menu */ }) {
                Icon(Icons.Default.Menu, contentDescription = "Меню")
            }
        }
    )
}
