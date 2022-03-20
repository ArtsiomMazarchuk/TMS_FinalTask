package com.example.ejournal.service;

import com.example.ejournal.dto.DisciplinesDto;

import java.util.List;

public interface DisciplinesService {

    DisciplinesDto saveDiscipline(DisciplinesDto disciplinesDto);

    void deleteDiscipline(Integer disciplineId);

    DisciplinesDto findByName(String name);

    List<DisciplinesDto> findAll();
}