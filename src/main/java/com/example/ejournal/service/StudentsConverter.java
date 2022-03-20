package com.example.ejournal.service;

import com.example.ejournal.dto.StudentsDto;
import com.example.ejournal.entity.Students;
import org.springframework.stereotype.Component;

@Component
public class StudentsConverter {

    public Students fromStudentDtoToStudent(StudentsDto studentsDto) {
        Students students = new Students();
        students.setId(studentsDto.getId());
        students.setGroup_stud(studentsDto.getGroup_stud());
        students.setName(studentsDto.getName());
        return students;
    }

    public StudentsDto fromStudentToStudentDto(Students students) {
        return StudentsDto.builder()
                .id(students.getId())
                .group_stud(students.getGroup_stud())
                .name(students.getName())
                .build();
    }
}