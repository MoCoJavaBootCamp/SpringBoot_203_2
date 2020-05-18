package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/personform")
    public String loadFormPage(Model model){
        model.addAttribute("person", new Person());
        return "personform";
    }
    @PostMapping("/personform")
    public String loafFromPage(@ModelAttribute Person person, Model model) {
        model.addAttribute("person", person);
        return "confirmperson";
    }
}
