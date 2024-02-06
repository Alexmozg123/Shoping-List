package ru.alexanderbor.shopinglist.domain.usecase

import ru.alexanderbor.shopinglist.domain.model.ShopModel
import ru.alexanderbor.shopinglist.domain.repository.ShopListRepository

class DeleteShopItemUseCase(
    private val shopListRepository: ShopListRepository
) {

    fun deleteShopItem(shopModel: ShopModel) {
        shopListRepository.deleteShopItem(shopModel)
    }
}