package com.atp.core.services.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.atp.core.dto.ContactDTO;

@Named
@Path("/")
public class ContactServRest {

	private static Map<String, ContactDTO> contactsMap; 
	
	static {
		if ( null == contactsMap) {
			contactsMap = new HashMap<String, ContactDTO>();
		}  

		ContactDTO c1Dto = new ContactDTO();
		c1Dto.setFirstName("Anuj");
		contactsMap.put(c1Dto.getFirstName(), c1Dto);


		ContactDTO c2Dto = new ContactDTO();
		c2Dto.setFirstName("Akshay");

		contactsMap.put(c2Dto.getFirstName(), c2Dto);

		ContactDTO c3Dto = new ContactDTO();
		c3Dto.setFirstName("Aditya");

		contactsMap.put(c3Dto.getFirstName(), c3Dto);

	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON) 
	public Collection<ContactDTO> getContacts() {
		/*
		 *  business logic goes here
		 */
		return contactsMap.values();
	}
	
	@GET 
	@Path("contact")
	@Produces(MediaType.APPLICATION_JSON)
	public ContactDTO getContactByMobOrNameMatch(
 			@QueryParam("name") String name ) {
		
		/*
		 *  business logic goes here
		 */
		
		return contactsMap.get(name);
	}
}
