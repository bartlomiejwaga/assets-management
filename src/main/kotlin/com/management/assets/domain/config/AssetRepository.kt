package com.management.assets.domain.config

import com.management.assets.domain.dto.Asset

interface AssetRepository {

    fun createAsset(assetRq: Asset): Asset
    fun updateAsset(assetRq: Asset): Asset
    fun findAssetById(id: Int): Asset?
    fun findAllAssets(): List<Asset>
    fun deleteAssetById(id: Int)

}