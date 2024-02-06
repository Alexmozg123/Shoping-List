package ru.alexanderbor.shopinglist.domain.repository

import ru.alexanderbor.shopinglist.domain.model.ShopModel

interface ShopListRepository {
    fun addShopItem(shopModel: ShopModel)
    fun deleteShopItem(shopModel: ShopModel)
    fun editShopItem(shopModel: ShopModel)
    fun getShopItem(shopItemId: Int)
    fun getShopList() : List<ShopModel>
}