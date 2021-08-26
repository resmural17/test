package com.mobicare.mobicareservices.model;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "\"Service\"")
public class CareService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -865891057262957043L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "\"serviceId\"")
	private Integer serviceId;
	
	@Column(name = "\"type\"",length=50)
	private String type;
	
	@Column(name = "\"currentLocation\"",length=50)
	private String currentLocation;
	
	@Column(name = "\"status\"",length=50)
	private String status;
	
	@Column(name = "\"orgId\"", nullable=false)
	private int orgId;
	
    @Column(name = "\"userId\"",nullable=false, length=50)
    private String userId;

    /** Default constructor. */
    public CareService() {
        super();
    }
    
    /**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the currentLocation
	 */
	public String getCurrentLocation() {
		return currentLocation;
	}

	/**
	 * @param currentLocation the currentLocation to set
	 */
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the orgId
	 */
	public int getOrgId() {
		return orgId;
	}

	/**
	 * @param orgId the orgId to set
	 */
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
