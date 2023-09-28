package com.dovindev.rover.controllers;

import com.dovindev.rover.dto.RoverDto;
import com.dovindev.rover.models.Command;
import com.dovindev.rover.models.Rover;
import com.dovindev.rover.services.IRoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoverController {

    @Autowired
    IRoverService service;

    @GetMapping("/rover")
    public Rover getById(){
        return service.getById();
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
