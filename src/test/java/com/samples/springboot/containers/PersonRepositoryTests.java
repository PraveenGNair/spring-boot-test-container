package com.samples.springboot.containers;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * JPA tests with datasource configured via standard properties files
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PersonRepositoryTests {

  @Autowired
  private PersonRepository personRepository;

  @Test
  void testFindAllReturnsName() {
    // This is defined in tc-initscript.sql
    List<Person> persons = personRepository.findAll();
    assertThat(persons.size()).isOne();
    assertThat(persons.get(0).getFirstName()).isEqualTo("Little");
    assertThat(persons.get(0).getLastName()).isEqualTo("Red");
  }
}
