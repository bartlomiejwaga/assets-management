package com.management.assets.controller

import com.management.assets.domain.dto.Asset
import com.management.assets.service.AssetService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
class AssetController(val assetService: AssetService) {

    @PostMapping("/")
    fun createAsset(@RequestParam asset: Asset): Asset =
        assetService.createAsset(asset)

    @PutMapping("/")
    fun updateAsset(@RequestParam asset: Asset): Asset =
        assetService.createAsset(asset)

    @GetMapping("/asset/{id}")
    fun findOneAsset(@PathVariable("id") id: Int): Asset? {
        return assetService.findOne(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }

    @GetMapping("/assets")
    fun findOneAsset(): List<Asset> {
        return assetService.findAll()
    }

}

