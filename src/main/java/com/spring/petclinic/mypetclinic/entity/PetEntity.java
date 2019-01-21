package com.spring.petclinic.mypetclinic.entity;

import com.spring.petclinic.mypetclinic.datatype.PetType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PETS")
public class PetEntity extends NamedEntity {

    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM--dd")
    private LocalDate birthDate;

    @Column(name = "pet_type")
    @Enumerated(EnumType.STRING)
    private PetType petType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "petId")
    //@JoinColumn
    private Set<OwnerEntity> owners;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "petId", fetch = FetchType.EAGER)
    private Set<VisitEntity> visits = new HashSet<>();

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Set<OwnerEntity> getOwners() {
        return owners;
    }

    public void setOwners(Set<OwnerEntity> owners) {
        this.owners = owners;
    }

    public Set<VisitEntity> getVisits() {
        return visits;
    }

    public void setVisits(Set<VisitEntity> visits) {
        this.visits = visits;
    }
}
