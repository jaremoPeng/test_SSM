package com.jaremo.test_ssm.mapper;

import com.jaremo.test_ssm.domain.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PersonMapper {

    @Select("select * from person")
    public List<Person> findAll();
}
