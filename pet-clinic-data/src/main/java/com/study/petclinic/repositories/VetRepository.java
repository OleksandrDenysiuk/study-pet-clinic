package com.study.petclinic.repositories;


import com.study.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository  extends CrudRepository<Vet, Long> {
}
