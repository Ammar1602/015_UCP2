package com.example.prak8

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

enum class PengelolaHalaman{
    Home,
    Registrasi,
    Summary
}

@Composable
fun Pengelola(
    viewModel: OrderViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
    navController: NavController = rememberNavController()
){

}