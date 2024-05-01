package com.idustrymentordata.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class BankProof {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long photoId;

    @Lob
    private byte[] panCardPhoto;

    @Lob
    private byte[] chequePhoto;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "mentor_id")
    private IndustryMentor mentor;
}
