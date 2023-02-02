package pl.edu.vistula.firstprojectjavaspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
//@RestController
public class HelloConrtoller {

    @GetMapping(value = "/")
    public String hello(){
        return "Hello Vistula, in my firs Spring Controller.";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "world") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
    //http://localhost:8080/greeting?name=Vistula



}
