package com.management.assets.service

import com.management.assets.domain.config.AssetRepository
import com.management.assets.domain.config.logger
import com.management.assets.domain.dto.Asset
import org.springframework.stereotype.Service

@Service
class AssetService(private val assetRepository: AssetRepository) {


    fun createAsset(asset: Asset): Asset {
        log.info("creating asset: ${asset}")
       return assetRepository.createAsset(asset)
    }

    fun updateAsset(asset: Asset): Asset {
        log.info("updating asset: ${asset}")
        return assetRepository.updateAsset(asset)
    }

    fun findOne(id: Int): Asset? {
       return assetRepository.findAssetById(id)
    }

    fun findAll(): List<Asset> {
        return assetRepository.findAllAssets()
    }

    fun deleteAsset(id: Int) {
        return assetRepository.deleteAssetById(id)
    }

    companion object {
        val log by logger()
    }


}