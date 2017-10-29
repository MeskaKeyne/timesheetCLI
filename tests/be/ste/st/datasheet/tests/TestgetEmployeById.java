package be.ste.st.datasheet.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import be.ste.st.datasheet.client.Client;
import be.ste.ts.datasheet.dto.DTOEmploye;

class TestgetEmployeById {
	private Client client;

	@BeforeEach
	void setUp() throws Exception { this.client = new Client();}

	@Test
	void test() {
		DTOEmploye employe = null;
		employe = this.client.getEmployeById(1);
		assertNotNull(employe);
		assertEquals(new Integer(1), employe.getId());
		
	}

}
