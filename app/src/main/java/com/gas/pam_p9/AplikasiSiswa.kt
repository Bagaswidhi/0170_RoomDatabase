package com.gas.pam_p9

import android.app.Application
import com.gas.pam_p9.repositori.ContainerApp
import com.gas.pam_p9.repositori.ContainerDataApp

class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()

        container = ContainerDataApp(this)
    }
}