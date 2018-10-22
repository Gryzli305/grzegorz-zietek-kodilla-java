package flyAway;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSuit {

    @Test
    public void test() {
        Set<Flight> flights = new HashSet<>();

        Flight flight1 = new Flight("WAR", "GDA");
        Flight flight2 = new Flight("WRO", "NYV");
        Flight flight3 = new Flight("NYC", "WAR");
        Flight flight4 = new Flight("BER", "GDA");
        Flight flight5 = new Flight("KRA", "GDA");
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);

        FlightSearcher flightSearcher = new FlightSearcher(flights);
        List<Flight> kra = flightSearcher.findByFlightCity("KRA");

        Assert.assertEquals(1, kra.size());
    }

    @Test
    public void test2() {
        Set<Flight> flights = new HashSet<>();

        Flight flight1 = new Flight("WAR", "GDA");
        Flight flight2 = new Flight("WRO", "NYV");
        Flight flight3 = new Flight("NYC", "WAR");
        Flight flight4 = new Flight("BER", "GDA");
        Flight flight5 = new Flight("KRA", "GDA");
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);

        FlightSearcher flightSearcher = new FlightSearcher(flights);
        List<Flight> gda = flightSearcher.findToFlightCity("GDA");

        Assert.assertEquals(3, gda.size());
    }

    @Test
    public void test3() {
        Set<Flight> flights = new HashSet<>();

        Flight flight1 = new Flight("WAR", "GDA");
        Flight flight2 = new Flight("WRO", "NYV");
        Flight flight3 = new Flight("NYC", "WAR");
        Flight flight4 = new Flight("BER", "GDA");
        Flight flight5 = new Flight("KRA", "GDA");
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);

        FlightSearcher flightSearcher = new FlightSearcher(flights);
        List<Flight> wro = flightSearcher.findFromFlightCity("WRO");

        Assert.assertEquals(1, wro.size());
    }
}
