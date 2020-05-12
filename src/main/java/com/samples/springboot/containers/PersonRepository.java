package com.samples.springboot.containers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@RestResource
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
