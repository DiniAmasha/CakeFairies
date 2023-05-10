package com.example.cakefairies.Controller;

import com.example.cakefairies.model.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "welcome NSBM";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public String welcomePost() {
        return "welcome NSBM from POST";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student)
}