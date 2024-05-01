package com.idustrymentordata.demo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class IndustryMentor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long mentorId;
    private String name;
    private String email;
    private String contact;
    private String organisation;
    private String expertise;
    private String experience;
    private String linkedInUsername;
    private String panCardNumber;


    @OneToOne(mappedBy="industryMentor",cascade=CascadeType.ALL)
    private BankDetails bankDetails;

    @OneToOne(mappedBy = "mentor",cascade = CascadeType.ALL)
    private BankProof bankProof;
}