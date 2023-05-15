package com.lld.elevatorsystem;

import com.lld.elevatorsystem.enums.Direction;
import com.lld.elevatorsystem.model.building.Building;

public class ElevatorSystem {
    public Building startElevatorSystem() {
        return new Building(15, 4);
    }
}
