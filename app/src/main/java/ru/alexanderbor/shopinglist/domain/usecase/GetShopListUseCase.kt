package ru.alexanderbor.shopinglist.domain.usecase

import ru.alexanderbor.shopinglist.domain.model.ShopModel
import ru.alexanderbor.shopinglist.domain.repository.ShopListRepository

class GetShopListUseCase(
    private val shopListRepository: ShopListRepository
) {

    fun getShopList() : List<ShopModel> =
        shopListRepository.getShopList()
}