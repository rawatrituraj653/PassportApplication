package com.nit.pass.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.pass.model.Person;

public interface PersonRepository extends JpaRepository<Person, String>{	
}
