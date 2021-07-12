package com.bocobi.back.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bocobi.back.entity.Compte;

@Repository
@CrossOrigin("*")
public interface CompteRepos extends CrudRepository<Compte, Long> {

}
