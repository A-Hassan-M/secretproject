package com.HAndN.spring_hibernate.models;

import javax.persistence.*;

@Entity
@Table(name = "instructor")
@PrimaryKeyJoinColumn(name = "id")
public class Instructor extends User {
    @Column(name = "certificate_link")
    private String certificateLink;
    @Column(name = "specialization")
    private String specialization;

    public String getCertificateLink() {
        return certificateLink;
    }

    public void setCertificateLink(String certificateLink) {
        this.certificateLink = certificateLink;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
