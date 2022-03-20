package com.example.ejournal.repository;

import com.example.ejournal.entity.Lists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListsRepository extends JpaRepository<Lists, Integer> {

    Lists findByGroupj(String group);
}
