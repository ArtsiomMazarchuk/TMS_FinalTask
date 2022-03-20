package com.example.ejournal.service;

import com.example.ejournal.dto.DisciplinesDto;
import com.example.ejournal.entity.Disciplines;
import org.springframework.stereotype.Component;

@Component
public class DisciplinesConverter  {

    public Disciplines fromDisciplineDtoToDiscipline(DisciplinesDto disciplinesDto) {
        Disciplines disciplines = new Disciplines();
        disciplines.setId(disciplinesDto.getId());
        disciplines.setGroups(disciplinesDto.getGroups());
        disciplines.setName(disciplinesDto.getName());
        return disciplines;
    }

    public DisciplinesDto fromDisciplineToDisciplineDto(Disciplines users) {
        return DisciplinesDto.builder()
                .id(users.getId())
                .groups(users.getGroups())
                .name(users.getName())
                .build();
    }
}