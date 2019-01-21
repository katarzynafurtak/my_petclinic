package com.spring.petclinic.mypetclinic.entity;

import com.spring.petclinic.mypetclinic.datatype.Specialty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class VetEntity extends PersonEntity{

    @Column(name = "specialty")
    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
