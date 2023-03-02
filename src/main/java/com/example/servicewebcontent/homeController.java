package com.example.servicewebcontent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String greetingForm(Model model) {
        model.addAttribute("enigme", new home());
        return "enigme";
    }

    @PostMapping("/result")
    public String greetingSubmit(@ModelAttribute home enigme, Model model) {
        model.addAttribute("enigme", enigme);
        return "result";
    }



}