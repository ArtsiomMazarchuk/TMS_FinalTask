package com.example.ejournal.service;

import com.example.ejournal.dto.GroupsDto;
import com.example.ejournal.entity.Groups;
import org.springframework.stereotype.Component;

@Component
public class GroupsConverter  {

    public Groups fromGroupDtoToGroup(GroupsDto groupsDto) {
        Groups groups = new Groups();
        groups.setId(groupsDto.getId());
        groups.setSpecialization(groupsDto.getSpecialization());
        groups.setName(groupsDto.getName());
        return groups;
    }

    public GroupsDto fromGroupToGroupDto(Groups users) {
        return GroupsDto.builder()
                .id(users.getId())
                .specialization(users.getSpecialization())
                .name(users.getName())
                .build();
    }
}