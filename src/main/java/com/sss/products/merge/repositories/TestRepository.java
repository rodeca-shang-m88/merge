package com.sss.products.merge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sss.products.merge.domain.entities.Person;

public interface TestRepository extends JpaRepository<Person, Long> {

}
