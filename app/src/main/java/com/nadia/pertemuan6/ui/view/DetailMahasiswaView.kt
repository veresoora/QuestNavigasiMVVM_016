package com.nadia.pertemuan6.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nadia.pertemuan6.model.Mahasiswa

@Composable
fun DetailMahasiswaView(
    dataMhs: Mahasiswa,
    modifier: Modifier = Modifier
) {
    val listDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Gender", dataMhs.gender),
        Pair("Alamat", dataMhs.alamat)
    )

    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        listDataMhs.forEach { data ->
            DetailMhs(judul = data.first,
                isinya = data.second)
        }
    }
}


@Composable
fun DetailMhs(
    judul: String, isinya: String
){
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = judul,
                modifier = Modifier.weight(1.2f))

            Text(text = ":",
                modifier = Modifier.weight(0.2f))

            Text(text = isinya,
                modifier = Modifier.weight(2f))

        }
    }
}