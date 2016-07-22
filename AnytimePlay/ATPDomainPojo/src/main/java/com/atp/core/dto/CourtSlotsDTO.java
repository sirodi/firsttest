/**
 * 
 */
package com.atp.core.dto;

import java.util.Date;

/**
 * @author sirodi
 *
 */
public class CourtSlotsDTO {
	 
	
	private Integer slotNumber;
	
	private Date bookingStartTime;
	
	private Integer bookingHours;
	
	private Date playStartTime;
	
	private Integer playedHours;
	
	private String allottedToGroup;

	public Integer getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(Integer slotNumber) {
		this.slotNumber = slotNumber;
	}

	public Date getBookingStartTime() {
		return bookingStartTime;
	}

	public void setBookingStartTime(Date bookingStartTime) {
		this.bookingStartTime = bookingStartTime;
	}

	public Integer getBookingHours() {
		return bookingHours;
	}

	public void setBookingHours(Integer bookingHours) {
		this.bookingHours = bookingHours;
	}

	public Date getPlayStartTime() {
		return playStartTime;
	}

	public void setPlayStartTime(Date playStartTime) {
		this.playStartTime = playStartTime;
	}

	public Integer getPlayedHours() {
		return playedHours;
	}

	public void setPlayedHours(Integer playedHours) {
		this.playedHours = playedHours;
	}

	public String getAllottedToGroup() {
		return allottedToGroup;
	}

	public void setAllottedToGroup(String allottedToGroup) {
		this.allottedToGroup = allottedToGroup;
	} 
	

}
