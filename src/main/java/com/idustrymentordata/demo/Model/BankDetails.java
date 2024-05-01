package com.idustrymentordata.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class BankDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bankName;
    private String branchAddress;
    private String accountNumber;
    private String ifscCode;
    
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="mentor_id")
    private IndustryMentor industryMentor;
}
