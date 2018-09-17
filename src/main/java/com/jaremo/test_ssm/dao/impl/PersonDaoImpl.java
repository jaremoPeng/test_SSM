package com.jaremo.test_ssm.dao.impl;

import com.jaremo.test_ssm.dao.PersonDao;
import com.jaremo.test_ssm.domain.Person;
import com.jaremo.test_ssm.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao{

    @Autowired
    private PersonMapper personMapper;

    public List<Person> findAll(){
        return personMapper.findAll();
    }
}
