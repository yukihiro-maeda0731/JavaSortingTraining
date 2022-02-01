package com.example.JavaSortingTraining.model;

import com.sun.jdi.IntegerValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Pokemon {
    private String name;
    private Integer HP;
    private Integer maxAttackPoint;
}