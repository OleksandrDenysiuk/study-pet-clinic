package com.study.petclinic.service;

import com.study.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName();

}
