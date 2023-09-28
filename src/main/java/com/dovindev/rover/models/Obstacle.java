package com.dovindev.rover.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "obstacle")
public class Obstacle {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "posx")
    private int x;
    @Column(name = "posy")
    private int y;

}
