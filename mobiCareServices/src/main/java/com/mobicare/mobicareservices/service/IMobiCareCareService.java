/**
 * 
 */
package com.mobicare.mobicareservices.service;

import java.util.List;
import java.util.Optional;

import com.mobicare.mobicareservices.model.CareService;

/**
 * @author 077542744
 *
 */
public interface IMobiCareCareService {

	List <CareService> getAllService();
	
	
    Optional<CareService> findById(int id);
    
	CareService add(CareService srv);
    
    //void update(int id);
}
