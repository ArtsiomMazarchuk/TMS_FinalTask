package com.example.ejournal.service;

import com.example.ejournal.dto.ListsDto;
import com.example.ejournal.entity.Lists;
import com.example.ejournal.repository.ListsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Service
@AllArgsConstructor
public class DefaultListsService implements ListsService {

    private final ListsRepository listsRepository;
    private final ListsConverter listsConverter;


    @Override
    public ListsDto saveList(ListsDto listsDto) {
        Lists savedList = listsRepository.save(listsConverter.fromListDtoToList(listsDto));
        return listsConverter.fromListToListDto(savedList);
    }

    @Override
    public void deleteList(Integer listId) {
        listsRepository.deleteById(listId);
    }

    @Override
    public ListsDto findByGroup_j(String group) {
        Lists lists = listsRepository.findByGroupj(group);
        if (lists != null) {
            return listsConverter.fromListToListDto(lists);
        }
        return null;
    }

    @Override
    public List<ListsDto> findAll() {
        return listsRepository.findAll()
                .stream()
                .map(listsConverter::fromListToListDto)
                .collect(Collectors.toList());
    }
}


