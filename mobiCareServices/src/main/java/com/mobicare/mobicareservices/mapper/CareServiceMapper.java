package com.mobicare.mobicareservices.mapper;

import com.mobicare.mobicareservices.dto.CareServiceDTO;
import com.mobicare.mobicareservices.model.CareService;

public class CareServiceMapper {

	public static CareService DtoToEntity(CareServiceDTO srv) {
		CareService service = new CareService();
		service.setCurrentLocation(srv.getCurrentLocation());
		service.setOrgId(srv.getOrgId());
		service.setServiceId(srv.getServiceId());
		service.setStatus(srv.getStatus());
		service.setType(srv.getType());
		service.setUserId(srv.getUserId());
		return service;
	}

	public static CareServiceDTO EntityToDto(CareService srv) {
		CareServiceDTO srvDTO = new CareServiceDTO();
		srvDTO.setCurrentLocation(srv.getCurrentLocation());
		srvDTO.setOrgId(srv.getOrgId());
		srvDTO.setServiceId(srv.getServiceId());
		srvDTO.setStatus(srv.getStatus());
		srvDTO.setType(srv.getType());
		srvDTO.setUserId(srv.getUserId());
		return srvDTO;
	}
}
