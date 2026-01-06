package pl.edu.vistula.task1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Task 1 is running. Try /greeting?name=Dominik";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", defaultValue = "Student") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
