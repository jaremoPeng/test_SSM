package com.jaremo.test_ssm.dao;

import com.jaremo.test_ssm.domain.Person;

import java.util.List;

public interface PersonDao {

    List<Person> findAll();
}
