package com.nadia.pertemuan6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavigatorState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.nadia.pertemuan6.ui.viewmodel.MahasiswaViewModel

enum class Halaman{
    Form,
    Data
}

@Composable
fun Navigasi(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    navHost :NavHostController = rememberNavController()
) {
    Scaffold { isipadding ->
        val uiState by viewModel.dataModel.collectAsState()
        NavHost(
            navController = navHost,
            startDestination = Halaman.Form.name,
            modifier = modifier.padding(isipadding)
        ) {
        }
    }
}