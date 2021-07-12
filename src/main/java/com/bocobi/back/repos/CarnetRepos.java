package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.entity.CarnetElectronique;

public interface CarnetRepos extends JpaRepository<CarnetElectronique, Long> {

}
