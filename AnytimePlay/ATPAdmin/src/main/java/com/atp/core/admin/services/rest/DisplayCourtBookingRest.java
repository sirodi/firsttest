/**
 * 
 */
package com.atp.core.admin.services.rest;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.client.RestTemplate;

import com.atp.core.dto.ContactDTO;
import com.atp.core.dto.CourtDetailDTO;
/**
 * @author sirodi
 *
 */

@Named
@Path("/")
public class DisplayCourtBookingRest {
	
	@Inject
	private RestTemplate restTemplate;

	@GET
	@Path("displayCourtDetails")
	@Produces(MediaType.APPLICATION_JSON)
	public CourtDetailDTO displayCourtBooking(@QueryParam("courtNumber") String courtNumber) {
		/*
		 * get all court associated members and 
		 * get contact details
		 */
		//assume iteration to be done here 
		
		CourtDetailDTO aCourtDetails = restTemplate.getForObject("http://localhost:8080/service/viewCourtBookingInfo/{courtNumber}", CourtDetailDTO.class, "1");

		
		ContactDTO aContactToDisplay = restTemplate.getForObject("http://localhost:8090/contact?name={name}", ContactDTO.class, "Aditya");

		//dummy settings to view the value 
		if ( null != aContactToDisplay && null != aCourtDetails) {
			aCourtDetails.setCourtName(aContactToDisplay.getFirstName());
			
		}
		
		return aCourtDetails;
	}
}
