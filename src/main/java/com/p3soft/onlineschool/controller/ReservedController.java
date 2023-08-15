package com.p3soft.onlineschool.controller;


import com.p3soft.onlineschool.repository.ReservedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReservedController {
    private final ReservedRepository reservedRepository;
    @Autowired
    public ReservedController(ReservedRepository reservedRepository){
        this.reservedRepository=reservedRepository;
    }

    @GetMapping("/reserved/{id}")
    public ModelAndView show(@PathVariable ("id") long courseId){
        ModelAndView modelAndView=new ModelAndView("reserved");
        modelAndView.addObject("courses",reservedRepository.findCourseById(courseId));
        return modelAndView;
    }
}
