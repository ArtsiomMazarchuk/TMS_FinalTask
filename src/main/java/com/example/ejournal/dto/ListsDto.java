package com.example.ejournal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListsDto {

    private Integer id;
    private String groupj;
    private String discipline;
    private String student;
    private String year;
    private String month;
    private String day;
    private String mark;

}
