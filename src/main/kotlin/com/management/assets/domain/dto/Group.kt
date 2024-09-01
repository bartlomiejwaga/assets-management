package com.management.assets.domain.dto

data class Group(val id: Int?, val name: String, val description: String, val assets: List<Asset>) {
}