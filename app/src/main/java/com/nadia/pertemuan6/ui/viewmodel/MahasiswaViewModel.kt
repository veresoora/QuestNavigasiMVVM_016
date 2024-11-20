package com.nadia.pertemuan6.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.nadia.pertemuan6.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel(){
    //only access internal class
    private val _dataModel = MutableStateFlow(Mahasiswa())
    //access for public
    val dataModel : StateFlow<Mahasiswa> = _dataModel.asStateFlow()

    fun saveDataMhs(
        listData : MutableList<String>
    ) {
        _dataModel.update { mhs ->
            mhs.copy(
                nama = listData[0],
                gender = listData[1],
                alamat = listData[2],
                noTelp = listData[3],
                email = listData[4],
                nim = listData[5]

            )
        }
    }

}