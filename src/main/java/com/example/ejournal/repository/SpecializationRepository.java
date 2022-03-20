package com.example.ejournal.repository;

import com.example.ejournal.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecializationRepository extends JpaRepository<Specialization, Integer> {

    Specialization findByName(String name);
}