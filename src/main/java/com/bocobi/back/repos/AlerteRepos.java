package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.entity.Alerte;

public interface AlerteRepos extends JpaRepository<Alerte, Long> {

}
