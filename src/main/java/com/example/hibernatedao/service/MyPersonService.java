package com.example.hibernatedao.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.hibernatedao.repository.PersonDAO;
import com.example.hibernatedao.entity.Person;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MyPersonService implements PersonService {

    private final PersonDAO personDao;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return personDao.getPersonsByCity(city);
    }
}
