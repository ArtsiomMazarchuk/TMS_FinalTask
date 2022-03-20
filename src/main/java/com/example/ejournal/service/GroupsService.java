package com.example.ejournal.service;

import com.example.ejournal.dto.GroupsDto;

import java.util.List;

public interface GroupsService {

    GroupsDto saveGroup(GroupsDto groupsDto);

    void deleteGroup(Integer userId);

    GroupsDto findByName(String name);

    List<GroupsDto> findAll();
}