package com.example.JavaSortingTraining.model;

import com.sun.jdi.IntegerValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class Pokemon {
    private Abilities abilities;

}

@Data
@AllArgsConstructor
class Abilities {
    private List<Ability> ability;
}

@Data
@AllArgsConstructor
class Ability {
    private String name;
    private String url;
    private boolean is_hidden;
    private int slot;
}


//public class Pokemon {
//    private String name;
//    private Integer HP;
//    private Integer maxAttackPoint;
//    private Trainer trainer;

//}

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Trainer {
//    private String tool;
//    private String name;
//    private String birthDate;
//}