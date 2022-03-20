package com.example.ejournal.controller;

import com.example.ejournal.dto.SpecializationDto;
import com.example.ejournal.service.SpecializationService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specialization")
@AllArgsConstructor
@Log
@CrossOrigin
public class SpecializationController {

    private final SpecializationService specializationService;

    @PostMapping("/save")
    public SpecializationDto saveSpecialization(@RequestBody SpecializationDto specializationDto){
        log.info("Handling save Specialization: " + specializationDto);
        return specializationService.saveSpecialization(specializationDto);
    }

    @GetMapping("/findAll")
    public List<SpecializationDto> findAllUsers() {
        log.info("Handling find all specialization request");
        return specializationService.findAll();
    }

    @GetMapping("/findByLogin")
    public SpecializationDto findByLogin(@RequestParam String login) {
        log.info("Handling find by login request: " + login);
        return specializationService.findByName(login);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSpecialization(@PathVariable Integer id) {
        log.info("Handling delete user request: " + id);
        specializationService.deleteSpecialization(id);
        return ResponseEntity.ok().build();
    }
}