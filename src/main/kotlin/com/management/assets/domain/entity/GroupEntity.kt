package com.management.assets.domain.entity

import jakarta.persistence.*


@Entity
@Table(name = "Asset_Group")
data class GroupEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    val name: String,
    val description: String,

    @OneToMany(mappedBy = "group")
    val assets: List<AssetEntity>
)