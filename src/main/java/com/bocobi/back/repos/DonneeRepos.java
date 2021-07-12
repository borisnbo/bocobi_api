package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.entity.Donnee;

public interface DonneeRepos extends JpaRepository<Donnee, Long> {

}
