package com.example.ejournal.service;

import com.example.ejournal.dto.ListsDto;

import java.util.List;

public interface ListsService {

    ListsDto saveList(ListsDto listsDto);

    void deleteList(Integer listId);

    ListsDto findByGroup_j(String group);

    List<ListsDto> findAll();
}