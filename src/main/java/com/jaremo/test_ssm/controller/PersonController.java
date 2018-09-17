package com.jaremo.test_ssm.controller;

import com.jaremo.test_ssm.domain.Person;
import com.jaremo.test_ssm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/query")
    public String queryPersonList(){
        List<Person> personList = personService.queryAll();
        System.out.println(personList);
        return "index.jsp";
    }
}
