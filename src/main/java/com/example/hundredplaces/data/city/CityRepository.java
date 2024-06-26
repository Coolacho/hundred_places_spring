package com.example.hundredplaces.data.city;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
    City findById(long id);
}
