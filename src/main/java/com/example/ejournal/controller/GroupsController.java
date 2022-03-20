package com.example.ejournal.controller;

import com.example.ejournal.dto.GroupsDto;
import com.example.ejournal.service.GroupsService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
@AllArgsConstructor
@Log
@CrossOrigin
public class GroupsController {

    private final GroupsService groupsService;

    @PostMapping("/save")
    public GroupsDto saveGroups(@RequestBody GroupsDto groupsDto) {
        log.info("Handling save groups: " + groupsDto);
        return groupsService.saveGroup(groupsDto);
    }

    @GetMapping("/findAll")
    public List<GroupsDto> findAllUsers() {
        log.info("Handling find all groups request");
        return groupsService.findAll();
    }

    @GetMapping("/findByLogin")
    public GroupsDto findByLogin(@RequestParam String name) {
        log.info("Handling find by name group request: " + name);
        return groupsService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteGroups(@PathVariable Integer id) {
        log.info("Handling delete group request: " + id);
        groupsService.deleteGroup(id);
        return ResponseEntity.ok().build();
    }
}
