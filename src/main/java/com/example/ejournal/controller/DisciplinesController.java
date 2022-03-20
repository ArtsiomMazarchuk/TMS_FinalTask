package com.example.ejournal.controller;

import com.example.ejournal.dto.DisciplinesDto;
import com.example.ejournal.service.DisciplinesService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplines")
@AllArgsConstructor
@Log
@CrossOrigin
public class DisciplinesController {

    private final DisciplinesService disciplinesService;

    @PostMapping("/save")
    public DisciplinesDto saveDisciplines(@RequestBody DisciplinesDto disciplinesDto) {
        log.info("Handling save disciplines: " + disciplinesDto);
        return disciplinesService.saveDiscipline(disciplinesDto);
    }

    @GetMapping("/findAll")
    public List<DisciplinesDto> findAllDisciplines() {
        log.info("Handling find all disciplines request");
        return disciplinesService.findAll();
    }

    @GetMapping("/findByLogin")
    public DisciplinesDto findByLogin(@RequestParam String name) {
        log.info("Handling find by name discipline request: " + name);
        return disciplinesService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDisciplines(@PathVariable Integer id) {
        log.info("Handling delete discipline request: " + id);
        disciplinesService.deleteDiscipline(id);
        return ResponseEntity.ok().build();
    }
}
