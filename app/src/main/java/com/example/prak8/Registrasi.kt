package com.example.prak8

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Registrasi(
    
    onSubmitButtonClicked : (MutableList<String>) -> Unit
){
    var nama by remember { mutableStateOf(value = "") }
    var nim by remember { mutableStateOf(value = "") }
    var konsentrasi by remember { mutableStateOf(value = "") }
    var judul by remember { mutableStateOf(value = "") }
    var dosen1 by remember { mutableStateOf(value = "") }
    var dosen2 by remember { mutableStateOf(value = "") }
    var listData: MutableList<String> = mutableListOf(nama, nim, konsentrasi)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()){
        Text(text = "Data Pelanggan",
            textAlign = TextAlign.Center,
            fontSize = 20.sp)
        Spacer(modifier = Modifier.padding(10.dp))
        OutlinedTextField(
            value = nama,
            onValueChange = {nama = it},
            label = { Text(text = "Nama")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp))
        OutlinedTextField(
            value = nim,
            onValueChange = {nim = it},
            label = { Text(text = "NIM")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp))
        OutlinedTextField(
            value = konsentrasi,
            onValueChange = {konsentrasi = it},
            label = { Text(text = "Konsentrasi")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp))
        OutlinedTextField(
            value = judul ,
            onValueChange = {judul = it},
            label = { Text(text = "Judul Skripsi")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp))
        Spacer(modifier = Modifier.padding(2.dp))
        RadioButton(selected = dosen1, onClick = {  })


        Button(
            modifier = Modifier,
            enabled = listData.isNotEmpty(),
            onClick = {onSubmitButtonClicked}
        ){

        }

}
}