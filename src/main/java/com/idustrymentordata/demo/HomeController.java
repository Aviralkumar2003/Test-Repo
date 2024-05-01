package com.idustrymentordata.demo;

import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @Autowired
    MentorService mentorService;

    @GetMapping("mentors")
    public String getMentors(Model model) throws DataFormatException {
        return mentorService.getAllMentors(model);
    }
}

