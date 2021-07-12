package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.entity.Medecin;

public interface MedecinRepos extends JpaRepository<Medecin, Long> {

}
