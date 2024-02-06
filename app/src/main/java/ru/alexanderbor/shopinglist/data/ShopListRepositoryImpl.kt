package ru.alexanderbor.shopinglist.data

import ru.alexanderbor.shopinglist.domain.model.ShopModel
import ru.alexanderbor.shopinglist.domain.repository.ShopListRepository

class ShopListRepositoryImpl : ShopListRepository {

    private val shopListItem = mutableListOf<ShopModel>()

    private var autoIncrementId = 0

    override fun addShopItem(shopModel: ShopModel) {
        if (shopModel.id == ShopModel.UNDEFINED_ID) {
            shopModel.id = autoIncrementId++
        }
        shopListItem.add(autoIncrementId, shopModel)
    }

    override fun deleteShopItem(shopModel: ShopModel) {
        shopListItem.remove(shopModel)
    }

    override fun editShopItem(shopModel: ShopModel) {
        val oldItem = shopListItem[shopModel.id]
        shopListItem.remove(oldItem)
        addShopItem(shopModel)
    }

    override fun getShopItem(shopItemId: Int) {
        shopListItem.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Nullable element!!!")
    }

    override fun getShopList(): List<ShopModel> = shopListItem.toList()
}