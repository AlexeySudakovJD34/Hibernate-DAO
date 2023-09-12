package com.example.hibernatedao.service;

import com.example.hibernatedao.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> getPersonsByCity(String city);
}