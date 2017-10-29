package be.ste.st.datasheet.client;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import be.ste.ts.datasheet.dto.DTOConverter;
import be.ste.ts.datasheet.dto.DTOEmploye;

public class Client {
	
	private WebTarget service;
	private DTOConverter converter;
	
	public Client() {
		super();
		this.service = ClientBuilder.newClient().target("http://localhost:8080/timesheet");
		this.converter = new DTOConverter();
	}
	public DTOEmploye getEmployeById(int id) {
		System.out.println("Client.getEmployeById()");
		String xml = this.service.path("employe").path(String.valueOf(id))
					.request(MediaType.TEXT_PLAIN)
					.get(String.class);
		System.out.println(xml);
		return this.converter.xmlToEmployee(xml);
	}
	
}
