package com.management.assets.controller

import com.management.assets.domain.dto.Asset
import com.management.assets.domain.dto.Group
import com.management.assets.service.AssetService
import com.management.assets.service.GroupService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
class GroupController(val groupService: GroupService) {

    @PostMapping("/")
    fun createAsset(@RequestParam group: Group): Group =
        groupService.createGroup(group)

    @PutMapping("/")
    fun updateAsset(@RequestParam group: Group): Group =
        groupService.updateAsset(group)

    @GetMapping("/group/{id}")
    fun findOneAsset(@PathVariable("id") id: Int): Group? {
        return groupService.findOne(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }

    @GetMapping("/groups")
    fun findOneAsset(): List<Group> {
        return groupService.findAll()
    }


}