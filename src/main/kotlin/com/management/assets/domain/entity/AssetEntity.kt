package com.management.assets.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "Asset")
data class AssetEntity(
    @Id @GeneratedValue val id: Int? = null,
    val name: String,
    val type: String,
    val description: String,
    @ManyToOne
    val group: GroupEntity? = null
) {
}
