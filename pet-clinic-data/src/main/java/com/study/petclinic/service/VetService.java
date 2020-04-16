package com.study.petclinic.service;

import com.study.petclinic.model.Pet;
import com.study.petclinic.model.Vet;

import java.util.Set;

public interface VetService  {
    Vet findById(Long id);
    Vet save(Pet pet);
    Set<Vet> findAll();
}
