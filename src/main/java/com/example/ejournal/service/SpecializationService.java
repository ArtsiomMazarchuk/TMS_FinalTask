package com.example.ejournal.service;

import com.example.ejournal.dto.SpecializationDto;
import com.example.ejournal.exception.ValidationException;

import java.util.List;

public interface SpecializationService  {

    SpecializationDto saveSpecialization(SpecializationDto specializationDto);

    void deleteSpecialization(Integer specializationId);

    SpecializationDto findByName(String name);

    List<SpecializationDto> findAll();
}