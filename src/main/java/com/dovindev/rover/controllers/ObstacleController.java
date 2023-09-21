package com.dovindev.rover.controllers;

import com.dovindev.rover.models.Obstacle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ObstacleController {

    @PostMapping("/obstacle")
    public void create(@RequestBody Obstacle obstacle){
    }
}
