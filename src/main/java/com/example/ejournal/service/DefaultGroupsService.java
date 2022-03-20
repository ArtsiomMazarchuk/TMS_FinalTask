package com.example.ejournal.service;

import com.example.ejournal.dto.GroupsDto;
import com.example.ejournal.entity.Groups;
import com.example.ejournal.repository.GroupsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.extern.java.Log;

import java.util.List;
import java.util.stream.Collectors;

@Log
@Service
@AllArgsConstructor
public class DefaultGroupsService implements GroupsService {

    private final GroupsRepository groupsRepository;
    private final GroupsConverter groupsConverter;


    @Override
    public GroupsDto saveGroup(GroupsDto groupsDto) {
        Groups savedGroup = groupsRepository.save(groupsConverter.fromGroupDtoToGroup(groupsDto));
        return groupsConverter.fromGroupToGroupDto(savedGroup);
    }

    @Override
    public void deleteGroup(Integer groupId) {
        groupsRepository.deleteById(groupId);
    }

    @Override
    public GroupsDto findByName(String name) {
        Groups groups = groupsRepository.findByName(name);
        if (groups != null) {
            return groupsConverter.fromGroupToGroupDto(groups);
        }
        return null;
    }

    @Override
    public List<GroupsDto> findAll() {
        return groupsRepository.findAll()
                .stream()
                .map(groupsConverter::fromGroupToGroupDto)
                .collect(Collectors.toList());
    }
}