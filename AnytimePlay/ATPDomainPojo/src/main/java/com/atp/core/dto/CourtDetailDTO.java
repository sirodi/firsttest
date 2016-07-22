/**
 * 
 */
package com.atp.core.dto;

import java.util.List;

/**
 * @author sirodi
 *
 */
public class CourtDetailDTO {
	
	/* Court identifier */
	private String courtId;
	
	private String courtName;
	
	
	/* This listing gives schedule wise allotment details and helps to identify unallocated courts */
	
	private List<CourtSlotsDTO> courtAllocationList;

	public String getCourtName() {
		return courtName;
	}
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
	public String getCourtId() {
		return courtId;
	}
	public void setCourtId(String courtId) {
		this.courtId = courtId;
	}
	public List<CourtSlotsDTO> getCourtAllocationList() {
		return courtAllocationList;
	}
	public void setCourtAllocationList(List<CourtSlotsDTO> courtAllocationList) {
		this.courtAllocationList = courtAllocationList;
	}
	 
	

}
