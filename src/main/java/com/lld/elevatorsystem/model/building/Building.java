package com.lld.elevatorsystem.model.building;

import com.lld.elevatorsystem.enums.Direction;
import com.lld.elevatorsystem.enums.ElevatorCommand;

public class Building {

    ElevatorController elevatorController;

    public Building(int noOfFloors, int noOfElevators) {
        elevatorController = new ClosestElevatorToFloorAlgo(noOfFloors, noOfElevators);
    }

    public void hallCommand(int floorNumber, Direction direction) {
        elevatorController.registerHallCommand(ElevatorCommand.HALL, floorNumber, direction);
    }

    public void elevatorCommand(int elevatorID, int floorNumber) {
        elevatorController.registerElevatorCommand(ElevatorCommand.ELEVATOR, elevatorID, floorNumber);
    }
}
