package com.management.assets.controller

import com.management.assets.domain.dto.Group
import com.management.assets.service.GroupService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/groups")
class GroupController(val groupService: GroupService) {

    @PostMapping
    fun createGroup(@RequestParam group: Group): Group =
        groupService.createGroup(group)

    @PutMapping
    fun updateGroup(@RequestParam group: Group): Group =
        groupService.updateAsset(group)

    @GetMapping("/{id}")
    fun findOneGroup(@PathVariable("id") id: Int): Group? {
        return groupService.findOne(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }

    @GetMapping
    fun findAllGroups(): List<Group> {
        return groupService.findAll()
    }


}