package com.example.teste;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class PersonRepositoryTest {
    private final PersonRepository personRepository;

    @Autowired
    public PersonRepositoryTest(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Test
    public void shouldInsertPeopleCorrectly() {
        var person1 = new Person(null , "Joao", "Pereira");
        var person2 = new Person(null , "Carlos", "Carneiro");

        person1 = personRepository.save(person1);
        person2 = personRepository.save(person2);

        assertNotNull(person1.getId());
        assertNotNull(person2.getId());
    }


}