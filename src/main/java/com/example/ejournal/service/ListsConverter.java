package com.example.ejournal.service;

import com.example.ejournal.dto.ListsDto;
import com.example.ejournal.entity.Lists;
import org.springframework.stereotype.Component;

@Component
public class ListsConverter {

    public Lists fromListDtoToList(ListsDto listsDto) {
        Lists lists = new Lists();
        lists.setId(listsDto.getId());
        lists.setGroupj(listsDto.getGroupj());
        lists.setDiscipline(listsDto.getDiscipline());
        lists.setStudent(listsDto.getStudent());
        lists.setYear(listsDto.getYear());
        lists.setMonth(listsDto.getMonth());
        lists.setDay(listsDto.getDay());
        lists.setMark(listsDto.getMark());
        return lists;
    }

    public ListsDto fromListToListDto(Lists lists) {
        return ListsDto.builder()
                .id(lists.getId())
                .groupj(lists.getGroupj())
                .discipline(lists.getDiscipline())
                .student(lists.getStudent())
                .year(lists.getYear())
                .month(lists.getMonth())
                .day(lists.getDay())
                .mark(lists.getMark())
                .build();
    }
}