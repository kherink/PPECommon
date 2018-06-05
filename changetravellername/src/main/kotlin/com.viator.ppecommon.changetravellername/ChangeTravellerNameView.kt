package com.viator.ppecommon.changetravellername

interface ChangeTravellerNameView {
    var travellers: List<Traveller>

    fun showLoading()

    fun hideLoading()
}