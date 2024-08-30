package com.management.assets.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class AssetEntity(@Id @GeneratedValue val id: Int? = null, val name: String, val type:String, val description:String) {
}
