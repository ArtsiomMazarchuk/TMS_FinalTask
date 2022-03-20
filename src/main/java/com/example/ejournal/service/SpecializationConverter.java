package com.example.ejournal.service;

import com.example.ejournal.dto.SpecializationDto;
import com.example.ejournal.entity.Specialization;
import org.springframework.stereotype.Component;

@Component
public class SpecializationConverter  {

    public Specialization fromSpecializationDtoToSpecialization(SpecializationDto specializationDto) {
        Specialization specialization = new Specialization();
        specialization.setId(specializationDto.getId());
        specialization.setName(specializationDto.getName());
        return specialization;
    }

    public SpecializationDto fromSpecializationToSpecializationDto(Specialization specialization) {
        return SpecializationDto.builder()
                .id(specialization.getId())
                .name(specialization.getName())
                .build();
    }
}