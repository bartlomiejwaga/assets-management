package com.management.assets.domain.config.jpa

import com.management.assets.domain.config.AssetRepository
import com.management.assets.domain.config.GroupRepository
import com.management.assets.domain.dto.Asset
import com.management.assets.domain.dto.Group
import com.management.assets.domain.entity.AssetEntity
import com.management.assets.domain.entity.GroupEntity
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
class GroupEntityRepository(val groupJpaRepository: GroupJpaRepository): GroupRepository {

    private fun Group.toEntity(): GroupEntity {
        return GroupEntity(id,
        name,
        description,
        assets.map { it.toEntity() },
        );
    }

    private fun AssetEntity.toDomain(): Asset {
        return Asset(id, name, type, description)
    }

    private fun GroupEntity.toDomain(): Group {
        return Group(id, name, description, assets.map { it.toDomain() })
    }

    override fun createGroup(group: Group): Group {
        return groupJpaRepository.save(group.toEntity()).toDomain()
    }

    override fun updateGroup(group: Group): Group {
        return groupJpaRepository.save(group.toEntity()).toDomain()
    }

    override fun findGroupById(id: Int): Group? {
        return groupJpaRepository.findByIdOrNull(id)?.toDomain()
    }

    override fun findGroupAssets(): List<Group> {
        return groupJpaRepository.findAll().mapNotNull { it.toDomain() };
    }

    private fun Asset.toEntity(): AssetEntity {
        return AssetEntity(id, name, type, description)
    }
}

