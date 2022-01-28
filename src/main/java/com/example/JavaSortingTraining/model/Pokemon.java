package com.example.JavaSortingTraining.model;

import com.sun.jdi.IntegerValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Pokemon {
    private String name;
    private Integer HP;
    private Integer maxAttackPoint;
//    private Trainer trainer;

}

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Trainer {
//    private String tool;
//    private String name;
//    private String birthDate;
//}