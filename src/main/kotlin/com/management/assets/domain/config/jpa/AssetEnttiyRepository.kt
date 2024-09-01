package com.management.assets.domain.config.jpa

import com.management.assets.domain.config.AssetRepository
import com.management.assets.domain.dto.Asset
import com.management.assets.domain.entity.AssetEntity
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
class AssetEntityRepository(val assetRepository: AssetJpaRepository): AssetRepository {

    override fun createAsset(assetRq: Asset): Asset {
        return assetRepository.save(assetRq.toEntity()).toDomain()
    }

    override fun updateAsset(assetRq: Asset): Asset {
        TODO("Not yet implemented")
    }

    override fun findAssetById(id: Int): Asset? {
        return assetRepository.findByIdOrNull(id)?.toDomain();
    }

    override fun findAllAssets(): List<Asset> {
        return assetRepository.findAll().mapNotNull { it.toDomain() }
    }

    override fun deleteAssetById(id: Int): Asset? {
        return assetRepository.deleteById(id)
    }

    private fun Asset.toEntity(): AssetEntity {
        return AssetEntity(id, name, type, description)
    }

    private fun AssetEntity.toDomain(): Asset {
        return Asset(id, name, type, description)
    }


}

