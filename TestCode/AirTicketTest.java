package runner;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AirTicketTest {
	public AirTicketTest() {
		
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Test
    public void testairlines_listCheck() {
        System.out.println("airlines_listCheck");
        String airlineId = "100024";
        String airlineName = "Biman Bangladesh";
        AirTicket instance = new AirTicket();
        String expResult = "pass";
        String result = instance.airlines_listCheck(airlineId, airlineName);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testairport_listCheck() {
        System.out.println("airport_listCheck");
        String airportId = "001";
        String airportName = "Shahjalal International Airport";
        AirTicket instance = new AirTicket();
        String expResult = "pass";
        String result = instance.airport_listCheck(airportId, airportName);
        assertEquals(expResult, result);

    }
    @Test
    public void testflight_listCheck() {
        System.out.println("flight_listCheck");
        String departure_airport_id = "001";
        String arrival_airport_id = "003";
        AirTicket instance = new AirTicket();
        String expResult = "pass";
        String result = instance.flight_listCheck(departure_airport_id, arrival_airport_id);
        assertEquals(expResult, result);

    }
}