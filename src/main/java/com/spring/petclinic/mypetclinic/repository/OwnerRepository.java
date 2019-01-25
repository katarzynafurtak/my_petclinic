package com.spring.petclinic.mypetclinic.repository;

import com.spring.petclinic.mypetclinic.entity.OwnerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface OwnerRepository extends CrudRepository<OwnerEntity, Integer> {

    Collection<OwnerEntity> findByLastName(String lastName);

}
