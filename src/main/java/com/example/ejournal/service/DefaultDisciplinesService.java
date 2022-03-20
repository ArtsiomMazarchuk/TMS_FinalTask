package com.example.ejournal.service;

import com.example.ejournal.dto.DisciplinesDto;
import com.example.ejournal.entity.Disciplines;
import com.example.ejournal.repository.DisciplinesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.extern.java.Log;

import java.util.List;
import java.util.stream.Collectors;

@Log
@Service
@AllArgsConstructor
public class DefaultDisciplinesService implements DisciplinesService {

    private final DisciplinesRepository disciplinesRepository;
    private final DisciplinesConverter disciplinesConverter;


    @Override
    public DisciplinesDto saveDiscipline(DisciplinesDto disciplinesDto) {
        Disciplines savedDiscipline = disciplinesRepository.save(disciplinesConverter.fromDisciplineDtoToDiscipline(disciplinesDto));
        return disciplinesConverter.fromDisciplineToDisciplineDto(savedDiscipline);
    }

    @Override
    public void deleteDiscipline(Integer disciplineId) {
        disciplinesRepository.deleteById(disciplineId);
    }

    @Override
    public DisciplinesDto findByName(String name) {
        Disciplines disciplines = disciplinesRepository.findByName(name);
        if (disciplines != null) {
            return disciplinesConverter.fromDisciplineToDisciplineDto(disciplines);
        }
        return null;
    }

    @Override
    public List<DisciplinesDto> findAll() {
        return disciplinesRepository.findAll()
                .stream()
                .map(disciplinesConverter::fromDisciplineToDisciplineDto)
                .collect(Collectors.toList());
    }
}