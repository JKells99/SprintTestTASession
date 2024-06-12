package com.keyin.Airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping("/allAirports")
    public List<Airport> getAllAirports(){
        return airportService.getAirports();
    }

    @PostMapping("")
    public Airport createAirport(@RequestBody Airport newAirport){
        return airportService.createAirport(newAirport);
    }

    @DeleteMapping("/{id}")
    public void deleteAirport(@PathVariable Long id) {
        airportService.deleteAirport(id);
    }

    @PutMapping("/{id}")
    public Airport updateAirport(@PathVariable Long id, @RequestBody Airport newAirport ) {
        return  airportService.updateAirport(id,newAirport);
    }
}
