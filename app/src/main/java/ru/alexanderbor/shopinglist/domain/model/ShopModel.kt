package ru.alexanderbor.shopinglist.domain.model

data class ShopModel(
    val id: Int,
    val name: String,
    val count: Int,
    val enable: Boolean,
)
