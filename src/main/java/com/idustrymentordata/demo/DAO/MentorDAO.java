package com.idustrymentordata.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.idustrymentordata.demo.Model.IndustryMentor;



@Repository
public interface MentorDAO extends JpaRepository<IndustryMentor,Long>{

    @Query("SELECT m.email FROM IndustryMentor m")
    List<String> findAllEmailIds();

    @Query("SELECT m.contact FROM IndustryMentor m")
    List<String> findAllContactNumbers();
}
