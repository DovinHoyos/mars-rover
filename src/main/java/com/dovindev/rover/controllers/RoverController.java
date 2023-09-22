package com.dovindev.rover.controllers;

import com.dovindev.rover.dto.RoverDto;
import com.dovindev.rover.models.Command;
import com.dovindev.rover.models.Direction;
import com.dovindev.rover.models.Rover;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoverController {

    @GetMapping("/rover/location")
    public Rover getLocation(){
        Rover rover = new Rover(1,6, Direction.EAST);
        return rover;
    }

    @PostMapping("/rover")
    public void create(@RequestBody RoverDto rover){
        System.out.println(rover);
    }

    @PostMapping("/commands")
    public void sendCommands(@RequestBody Command command){
        System.out.println(command);
    }
}
