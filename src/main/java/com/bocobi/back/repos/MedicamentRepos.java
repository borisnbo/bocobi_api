package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.entity.Medicament;

public interface MedicamentRepos extends JpaRepository<Medicament, Long> {

}
