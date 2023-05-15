package com.lld.elevatorsystem;

import com.lld.elevatorsystem.enums.Direction;
import com.lld.elevatorsystem.exception.InvalidFloor;
import com.lld.elevatorsystem.model.building.Building;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ElevatorSystemTest {

    ElevatorSystem elevatorSystem;

    @BeforeEach
    void setup() {
        elevatorSystem = new ElevatorSystem();
    }

    @Test
    void startElevatorSystem() {
        Building building = elevatorSystem.startElevatorSystem();
        building.hallCommand(2, Direction.UP);
        building.elevatorCommand(1, 1);
        building.hallCommand(0, Direction.UP);

        building.hallCommand(15, Direction.DOWN);
        building.elevatorCommand(4, 13);
    }

    @Test
    void startElevatorSystemInvalidFloor() {
        Building building = elevatorSystem.startElevatorSystem();
        building.hallCommand(2, Direction.UP);
        building.elevatorCommand(1, 1);
        building.hallCommand(0, Direction.UP);

        assertThrows(Exception.class,
                () -> building.hallCommand(6, Direction.DOWN));
    }


}