package com.example.ejournal.service;

import com.example.ejournal.dto.StudentsDto;
import com.example.ejournal.exception.ValidationException;

import java.util.List;

public interface StudentsService {

    StudentsDto saveStudent(StudentsDto studentsDto);

    void deleteStudent(Integer studentId);

    StudentsDto findByName(String name);

    List<StudentsDto> findAll();
}