package com.study.petclinic.service;

import com.study.petclinic.model.Owner;
import com.study.petclinic.model.Pet;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName();
    Owner findById(Long id);
    Owner save(Pet pet);
    Set<Owner> findAll();
}
