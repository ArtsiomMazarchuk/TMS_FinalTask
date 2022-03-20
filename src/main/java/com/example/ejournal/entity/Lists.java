package com.example.ejournal.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "lists_table")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
public class Lists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String groupj;

    @Column
    private String discipline;

    @Column
    private String student;

    @Column
    private String year;

    @Column
    private String month;

    @Column
    private String day;

    @Column
    private String mark;
}