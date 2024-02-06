package ru.alexanderbor.shopinglist.domain.usecase

import ru.alexanderbor.shopinglist.domain.repository.ShopListRepository

class GetShopItemUseCase(
    private val shopListRepository: ShopListRepository
) {

    fun getShopItem(shopItemId: Int) {
        shopListRepository.getShopItem(shopItemId)
    }
}