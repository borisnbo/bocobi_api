package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bocobi.back.entity.Demo;

@Repository
@CrossOrigin("*")
public interface DemoRepos extends JpaRepository<Demo, Long> {

}
