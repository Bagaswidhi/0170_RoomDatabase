package com.gas.pam_p9.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.gas.pam_p9.AplikasiSiswa

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            _root_ide_package_.com.gas.pam_p9.viewmodel.HomeViewModel(
                aplikasiSiswa().container.repositoriSiswa
            )
        }

        initializer {
            _root_ide_package_.com.gas.pam_p9.viewmodel.EntryViewModel(
                aplikasiSiswa().container.repositoriSiswa
            )
        }
        initializer {
            _root_ide_package_.com.gas.pam_p9.viewmodel.EditViewModel(
                this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa
            )
        }
        initializer {
            _root_ide_package_.com.gas.pam_p9.viewmodel.DetailViewModel(
                this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa
            )
        }
    }
}

/**
 * Fungsi ekstensi query untuk objek Application
 * dan mengembalikan sebuah instance AplikasiSiswa.
 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)