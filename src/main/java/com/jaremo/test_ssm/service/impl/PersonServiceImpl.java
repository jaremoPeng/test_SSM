package com.jaremo.test_ssm.service.impl;

import com.jaremo.test_ssm.dao.PersonDao;
import com.jaremo.test_ssm.domain.Person;
import com.jaremo.test_ssm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonDao personDao;

    public List<Person> queryAll(){

        return personDao.findAll();
    }
}
