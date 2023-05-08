package com.here.Objects;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

private String name;
private int age;
private Object car;
private List<String> cars;
private boolean blonde;

}
