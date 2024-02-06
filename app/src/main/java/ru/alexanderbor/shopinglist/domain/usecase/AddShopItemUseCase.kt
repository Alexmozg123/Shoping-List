package ru.alexanderbor.shopinglist.domain.usecase

import ru.alexanderbor.shopinglist.domain.model.ShopModel
import ru.alexanderbor.shopinglist.domain.repository.ShopListRepository

class AddShopItemUseCase(
    private val shopListRepository: ShopListRepository
) {

    fun addShopItem(shopModel: ShopModel) {
        shopListRepository.addShopItem(shopModel)
    }
}