package com.idustrymentordata.demo.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idustrymentordata.demo.Model.BankDetails;



@Repository
public interface BankDAO extends JpaRepository<BankDetails,Long> {
    
}
