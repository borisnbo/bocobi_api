package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.entity.Vaccin;

public interface VaccinRepos extends JpaRepository<Vaccin, Long> {

}
