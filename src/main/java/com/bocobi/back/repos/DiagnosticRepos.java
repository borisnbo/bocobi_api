package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.entity.Diagnostique;

public interface DiagnosticRepos extends JpaRepository<Diagnostique, Long> {

}
