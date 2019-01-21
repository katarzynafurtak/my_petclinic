package com.spring.petclinic.mypetclinic.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContactData {

    @Column(length = 40, nullable = false)
    private String city;

    @Column(length = 50)
    private String address;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 9, nullable = false)
    private String phoneNumber;

    public ContactData() {
    }

    public ContactData(String city, String address, String email, String phoneNumber) {
        this.city = city;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


}
