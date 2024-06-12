package com.keyin.Airport;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {

    private List<Airport> airportList = new ArrayList<>();

    public List <Airport> getAirports(){
        return  airportList;
    }


    public Airport createAirport(Airport newAirport) {
        airportList.add(newAirport);

        return newAirport;
    }
}
