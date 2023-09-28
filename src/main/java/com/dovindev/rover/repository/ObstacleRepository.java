package com.dovindev.rover.repository;

import com.dovindev.rover.models.Obstacle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObstacleRepository extends JpaRepository<Obstacle, Long> {
}
