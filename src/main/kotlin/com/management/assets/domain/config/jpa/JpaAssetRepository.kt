package com.management.assets.domain.config.jpa

import com.management.assets.domain.entity.AssetEntity
import org.springframework.data.jpa.repository.JpaRepository

interface JpaAssetRepository: JpaRepository<AssetEntity, Int>   {
}