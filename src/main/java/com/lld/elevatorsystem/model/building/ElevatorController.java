package com.lld.elevatorsystem.model.building;

import com.lld.elevatorsystem.enums.Direction;
import com.lld.elevatorsystem.enums.ElevatorCommand;

public interface ElevatorController {
    void registerHallCommand(ElevatorCommand elevatorCommand, int floorNumber, Direction direction);

    void registerElevatorCommand(ElevatorCommand elevator, int elevatorID, int floorNumber);
}
