package com.study.petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person{
    private Set<Pet> pets = new HashSet<>();

}
