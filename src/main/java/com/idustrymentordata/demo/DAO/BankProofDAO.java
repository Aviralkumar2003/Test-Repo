package com.idustrymentordata.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idustrymentordata.demo.Model.BankProof;

@Repository
public interface BankProofDAO extends JpaRepository<BankProof,Long>{
    
}
