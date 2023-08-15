package com.p3soft.onlineschool.controller;

import com.p3soft.onlineschool.repository.CourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    public MainController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @RequestMapping(value = {"/","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/about")
    public ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("about");
        return modelAndView;
    }

   @RequestMapping("/contact")
    public ModelAndView contact(){
       ModelAndView modelAndView=new ModelAndView();
       modelAndView.setViewName("contact");
       return modelAndView;
   }

   @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
   }

    @RequestMapping("/privacy")
    public ModelAndView privacy(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("privacy");
        return modelAndView;
    }

    @RequestMapping("/register")
    public ModelAndView register(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }
    final
    CourseRepository courseRepository;
    @GetMapping("/courses")
    public ModelAndView getAllCourses(){
        ModelAndView modelAndView = new ModelAndView("course");
        modelAndView.addObject("courses",courseRepository.findAll());
        return modelAndView;
    }

}
