package com.gas.pam_p9.view.route

import com.gas.pam_p9.R
import com.gas.pam_p9.uicontroller.DestinasiNavigasi

object DestinasiEditSiswa : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"
}