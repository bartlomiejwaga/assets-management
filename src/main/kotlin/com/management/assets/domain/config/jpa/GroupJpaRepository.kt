package com.management.assets.domain.config.jpa

import com.management.assets.domain.entity.AssetEntity
import com.management.assets.domain.entity.GroupEntity
import org.springframework.data.jpa.repository.JpaRepository

interface GroupJpaRepository : JpaRepository<GroupEntity, Int> {
}