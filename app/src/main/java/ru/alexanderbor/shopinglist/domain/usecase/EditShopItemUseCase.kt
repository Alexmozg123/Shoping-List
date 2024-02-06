package ru.alexanderbor.shopinglist.domain.usecase

import ru.alexanderbor.shopinglist.domain.model.ShopModel
import ru.alexanderbor.shopinglist.domain.repository.ShopListRepository

class EditShopItemUseCase(
    private val shopListRepository: ShopListRepository
) {

    fun editShopItem(shopModel: ShopModel) {
        shopListRepository.editShopItem(shopModel)
    }
}