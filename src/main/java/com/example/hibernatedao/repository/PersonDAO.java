package com.example.hibernatedao.repository;

import com.example.hibernatedao.entity.Person;

import java.util.List;

public interface PersonDAO {

    List<Person> getPersonsByCity(String city);
}
