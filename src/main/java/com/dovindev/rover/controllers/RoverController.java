package com.dovindev.rover.controllers;

import com.dovindev.rover.dto.RoverDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RoverController {

    @PostMapping("/rover")
    public void create(@RequestBody RoverDto rover){
        System.out.println(rover);

    }
}
