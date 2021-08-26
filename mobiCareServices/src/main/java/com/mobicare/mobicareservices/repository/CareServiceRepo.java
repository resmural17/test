package com.mobicare.mobicareservices.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.mobicare.mobicareservices.model.CareService;

@Component
public interface CareServiceRepo extends  JpaRepository<CareService, Integer>{

	//Optional<CurrencyConversion> findByCountryCode(String countryCode);
}
