package com.example.ejournal.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "disciplines")
@Data
@NoArgsConstructor
public class Disciplines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String groups;

    @Column
    private String name;

}