package com.keyin.Airport;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    public void deleteAirport(@PathVariable Long id) {

        airportList.removeIf(airport -> airport.getAirportId() == id);

    }

    public Airport updateAirport(Long id, Airport newAirport) {

        for (Airport airport: airportList) {
            if(airport.getAirportId() == id){
                airport.setAirportCity(newAirport.getAirportCity());
                airport.setAirportCode(newAirport.getAirportCode());
                airport.setAirportName(newAirport.getAirportName());


            }

        }


        return newAirport;
    }
}
