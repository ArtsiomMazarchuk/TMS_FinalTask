package com.example.ejournal.controller;

import com.example.ejournal.dto.ListsDto;
import com.example.ejournal.exception.ValidationException;
import com.example.ejournal.service.ListsService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
@AllArgsConstructor
@Log
@CrossOrigin
public class ListsController {

    private final ListsService listsService;

    @PostMapping("/save")
    public ListsDto saveLists(@RequestBody ListsDto listsDto) throws ValidationException {
        log.info("Handling save lists: " + listsDto);
        return listsService.saveList(listsDto);
    }

    @GetMapping("/findAll")
    public List<ListsDto> findAllLists() {
        log.info("Handling find all lists request");
        return listsService.findAll();
    }

    @GetMapping("/findByLogin")
    public ListsDto findByLogin(@RequestParam String group) {
        log.info("Handling find by login request: " + group);
        return listsService.findByGroup_j(group);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteLists(@PathVariable Integer id) {
        log.info("Handling delete list request: " + id);
        listsService.deleteList(id);
        return ResponseEntity.ok().build();
    }
}