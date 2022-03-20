package com.example.ejournal.repository;

import com.example.ejournal.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Integer> {

    Students findByName(String name);
}
