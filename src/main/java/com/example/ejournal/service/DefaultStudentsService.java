package com.example.ejournal.service;

import com.example.ejournal.dto.StudentsDto;
import com.example.ejournal.entity.Students;
import com.example.ejournal.exception.ValidationException;
import com.example.ejournal.repository.StudentsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Service
@AllArgsConstructor
public class DefaultStudentsService implements StudentsService {

    private final StudentsRepository studentsRepository;
    private final StudentsConverter studentsConverter;


    @Override
    public StudentsDto saveStudent(StudentsDto studentsDto){
        Students savedStudent = studentsRepository.save(studentsConverter.fromStudentDtoToStudent(studentsDto));
        return studentsConverter.fromStudentToStudentDto(savedStudent);
    }

    @Override
    public void deleteStudent(Integer studentId) {
        studentsRepository.deleteById(studentId);
    }

    @Override
    public StudentsDto findByName(String name) {
        Students students = studentsRepository.findByName(name);
        if (students != null) {
            return studentsConverter.fromStudentToStudentDto(students);
        }
        return null;
    }

    @Override
    public List<StudentsDto> findAll() {
        return studentsRepository.findAll()
                .stream()
                .map(studentsConverter::fromStudentToStudentDto)
                .collect(Collectors.toList());
    }
}


