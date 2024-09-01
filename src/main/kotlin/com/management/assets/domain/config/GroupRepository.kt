package com.management.assets.domain.config

import com.management.assets.domain.dto.Group

interface GroupRepository {

    fun createGroup(group: Group): Group
    fun updateGroup(group: Group): Group
    fun findGroupById(id: Int): Group?
    fun findGroupAssets(): List<Group>

}