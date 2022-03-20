package com.example.ejournal.service;

import com.example.ejournal.dto.SpecializationDto;
import com.example.ejournal.entity.Specialization;
import com.example.ejournal.exception.ValidationException;
import com.example.ejournal.repository.SpecializationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Service
@AllArgsConstructor
public class DefaultSpecializationService implements SpecializationService {

    private final SpecializationRepository specializationRepository;
    private final SpecializationConverter specializationConverter;


    @Override
    public SpecializationDto saveSpecialization(SpecializationDto specializationDto){
        Specialization savedSpecialization = specializationRepository.save(specializationConverter.fromSpecializationDtoToSpecialization(specializationDto));
        return specializationConverter.fromSpecializationToSpecializationDto(savedSpecialization);
    }

    @Override
    public void deleteSpecialization(Integer specializationId) {
        specializationRepository.deleteById(specializationId);
    }

    @Override
    public SpecializationDto findByName(String name) {
        return null;
    }


    @Override
    public List<SpecializationDto> findAll() {
        return specializationRepository.findAll()
                .stream()
                .map(specializationConverter::fromSpecializationToSpecializationDto)
                .collect(Collectors.toList());
    }
}