package com.management.assets.controller

import com.management.assets.domain.dto.Asset
import com.management.assets.service.AssetService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/assets")
class AssetController(val assetService: AssetService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createAsset(@RequestBody asset: Asset): Asset =
        assetService.createAsset(asset)

    @PutMapping
    fun updateAsset(@RequestBody asset: Asset): Asset =
        assetService.createAsset(asset)

    @GetMapping("/{id}")
    fun findOneAsset(@PathVariable("id") id: Int): Asset? {
        return assetService.findOne(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }

    @GetMapping
    fun findAllAssets(): List<Asset> {
        return assetService.findAll()
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteAsset(@PathVariable("id") id: Int) {
        return assetService.deleteAsset(id)
    }

}

