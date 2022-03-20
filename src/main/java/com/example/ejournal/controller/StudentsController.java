package com.example.ejournal.controller;

import com.example.ejournal.dto.StudentsDto;
import com.example.ejournal.exception.ValidationException;
import com.example.ejournal.service.StudentsService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
@Log
@CrossOrigin
public class StudentsController {

    private final StudentsService studentsService;

    @PostMapping("/save")
    public StudentsDto saveStudents(@RequestBody StudentsDto studentsDto){
        log.info("Handling save students: " + studentsDto);
        return studentsService.saveStudent(studentsDto);
    }

    @GetMapping("/findAll")
    public List<StudentsDto> findAllStudents() {
        log.info("Handling find all students request");
        return studentsService.findAll();
    }

    @GetMapping("/findByLogin")
    public StudentsDto findByLogin(@RequestParam String name) {
        log.info("Handling find by login request: " + name);
        return studentsService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStudents(@PathVariable Integer id) {
        log.info("Handling delete student request: " + id);
        studentsService.deleteStudent(id);
        return ResponseEntity.ok().build();
    }
}