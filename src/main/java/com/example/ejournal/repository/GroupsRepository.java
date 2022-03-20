package com.example.ejournal.repository;

import com.example.ejournal.entity.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupsRepository extends JpaRepository<Groups, Integer> {

    Groups findByName(String name);
}