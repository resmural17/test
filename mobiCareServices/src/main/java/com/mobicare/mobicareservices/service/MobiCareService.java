package com.mobicare.mobicareservices.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mobicare.mobicareservices.model.CareService;
import com.mobicare.mobicareservices.repository.CareServiceRepo;

@Service
public class MobiCareService implements IMobiCareCareService {

	@Autowired
	private CareServiceRepo serviceRepo;

	@Override
	public List<CareService> getAllService() {
		return serviceRepo.findAll();
	}

	@Override
	public CareService add(CareService srv) {
		srv.setStatus("New");
		return serviceRepo.save(srv);
	}

	@Override
	public Optional<CareService> findById(int id) {
		return serviceRepo.findById(id);

	}

}
