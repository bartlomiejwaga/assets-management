package com.management.assets.service

import com.management.assets.domain.config.AssetRepository
import com.management.assets.domain.dto.Asset
import com.management.assets.domain.entity.AssetEntity
import com.management.assets.domain.dto.AssetRq
import org.springframework.stereotype.Service

@Service
class AssetService(private val assetRepository: AssetRepository) {

    fun createAsset(asset: Asset): Asset {
       return assetRepository.createAsset(asset)
    }

    fun updateAsset(asset: Asset): Asset {
       return assetRepository.updateAsset(asset)
    }

    fun findOne(id: Int): Asset? {
       return assetRepository.findAssetById(id)
    }

    fun findAll(): List<Asset> {
        return assetRepository.findAllAssets()
    }

}