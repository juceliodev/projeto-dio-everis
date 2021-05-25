package com.github.juceliodesa.citiesapi.contries;

import com.github.juceliodesa.citiesapi.contries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

//extends JpaRepository que é uma Spring de dados
public interface CountryRepository extends JpaRepository<Country, Long> {

}
