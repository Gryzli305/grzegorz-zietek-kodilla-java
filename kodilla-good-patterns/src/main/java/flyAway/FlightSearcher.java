package flyAway;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {

private Set<Flight> availableFlights;

public  FlightSearcher(Set<Flight> availableFlights) {
    this.availableFlights = availableFlights;
}

    public Set<Flight> getAvailableFlights() {
        return availableFlights;
    }

    public List<Flight> findFromFlightCity(String city) {
        return availableFlights.stream().filter(flight -> flight.getDepartureAirport().equals(city))
                .collect(Collectors.toList());
    }
        public List<Flight> findToFlightCity(String city) {
        return availableFlights.stream().filter(flight -> flight.getArrivalAirport().equals(city))
               .collect(Collectors.toList());

    }

    public List<Flight> findByFlightCity(String from) {
        List<Flight> collect = availableFlights.stream().filter(flight -> flight.getDepartureAirport().equals(from) || flight.getArrivalAirport().equals(from))
                .collect(Collectors.toList());
       return collect;

    }

}
