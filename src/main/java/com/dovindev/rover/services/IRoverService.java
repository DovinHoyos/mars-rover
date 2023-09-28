package com.dovindev.rover.services;

import com.dovindev.rover.models.Rover;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoverService{
    Rover getById();
}
