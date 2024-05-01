package com.idustrymentordata.demo;


import java.util.List;
import java.util.zip.DataFormatException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.idustrymentordata.demo.DAO.MentorDAO;
import com.idustrymentordata.demo.Model.IndustryMentor;

@Service
public class MentorService {

    @Autowired
    MentorDAO mentorDAO;

    public String getAllMentors(Model model) throws DataFormatException {
        List<IndustryMentor> mentors = mentorDAO.findAll();
        model.addAttribute("mentors", mentors);
        model.addAttribute("imgUtil", new ImageUtil());
        return "mentees";
    }
}
