package com.spring.petclinic.mypetclinic.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
public class VisitEntity {

    @Column(name = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd-hh-mm")
    private LocalDateTime date;

    @Column(name = "description")
    @NotEmpty
    private String description;

    @Column(name = "pet_id")
    private Integer petId;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}
