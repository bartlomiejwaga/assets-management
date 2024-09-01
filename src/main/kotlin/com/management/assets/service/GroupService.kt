package com.management.assets.service;

import com.management.assets.domain.config.GroupRepository;
import com.management.assets.domain.dto.Group;
import org.springframework.stereotype.Service;

@Service
class GroupService(val groupRepository: GroupRepository) {

    fun createGroup(group: Group): Group {
        return groupRepository.createGroup(group)
    }

    fun updateAsset(group: Group): Group {
        return groupRepository.updateGroup(group)
    }

    fun findOne(id: Int): Group? {
        return groupRepository.findGroupById(id)
    }

    fun findAll(): List<Group> {
        return groupRepository.findGroupAssets()
    }

}
