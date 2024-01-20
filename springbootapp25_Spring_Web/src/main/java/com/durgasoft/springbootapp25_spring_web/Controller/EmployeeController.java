package com.durgasoft.springbootapp25_spring_web.Controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("emp")
public class EmployeeController {
    @RequestMapping("homepage")
    public String showHomePage(Model model){
        model.addAttribute("message","welcome to spring boot WEB mvc Application");
        return "home";

    }
}
