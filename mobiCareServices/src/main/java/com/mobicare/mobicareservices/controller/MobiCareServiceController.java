package com.mobicare.mobicareservices.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mobicare.mobicareservices.dto.CareServiceDTO;
import com.mobicare.mobicareservices.exception.CareServiceNotFoundException;
import com.mobicare.mobicareservices.mapper.CareServiceMapper;
import com.mobicare.mobicareservices.model.CareService;
import com.mobicare.mobicareservices.service.MobiCareService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/mobicare")
public class MobiCareServiceController {

	@Autowired
	MobiCareService mobiCareService;

	@GetMapping(value = "/services")
	List<CareService> getAll() {
		return mobiCareService.getAllService();
	}

	@PostMapping(value = "/addService")
	ResponseEntity<?> addCareService(@Valid @RequestBody CareServiceDTO srvdto) {
		CareService caresrv = CareServiceMapper.DtoToEntity(srvdto);
		CareService addsrv = mobiCareService.add(caresrv);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(addsrv.getServiceId()).toUri();
		return ResponseEntity.created(location)
				.body("New Service Type:" + addsrv.getType() + " created ::" + addsrv.getServiceId());
	}

	@PutMapping(value = "/updateService/{id}")
	ResponseEntity<?> updateProduct(@PathVariable("id") int id, @Valid @RequestBody CareServiceDTO srvdto) {
		CareService srv = mobiCareService.findById(id)
				.orElseThrow(() -> new CareServiceNotFoundException("No Product with ID : " + id));

		CareService newsrv = CareServiceMapper.DtoToEntity(srvdto);
		newsrv.setServiceId(srv.getServiceId());
		newsrv.setStatus("Update");
		mobiCareService.add(newsrv);
		return ResponseEntity.ok().body("Service has been updated:" + newsrv.getServiceId());
	}

}
