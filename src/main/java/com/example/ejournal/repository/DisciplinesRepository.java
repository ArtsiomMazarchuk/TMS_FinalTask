package com.example.ejournal.repository;

import com.example.ejournal.entity.Disciplines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinesRepository extends JpaRepository<Disciplines, Integer> {

    Disciplines findByName(String name);
}