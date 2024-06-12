package com.keyin.Airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping("/airports")
    public List<Airport> getAllAirports(){
        return airportService.getAirports();
    }

    @PostMapping("/airport")
    public Airport createAirport(@RequestBody Airport newAirport){
        return airportService.createAirport(newAirport);
    }
}
