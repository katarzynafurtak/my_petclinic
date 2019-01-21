package com.spring.petclinic.mypetclinic.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "OWNERS")
public class OwnerEntity extends PersonEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    //@JoinColumn
    private Set<PetEntity> pets;

    public Set<PetEntity> getPets() {
        return pets;
    }

    public void setPets(Set<PetEntity> pets) {
        this.pets = pets;
    }
}
