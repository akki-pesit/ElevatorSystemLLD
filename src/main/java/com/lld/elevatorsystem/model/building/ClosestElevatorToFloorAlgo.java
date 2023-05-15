package com.lld.elevatorsystem.model.building;

import com.lld.elevatorsystem.enums.Direction;
import com.lld.elevatorsystem.enums.ElevatorCommand;
import com.lld.elevatorsystem.exception.InvalidFloor;
import com.lld.elevatorsystem.model.elevator.Elevator;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClosestElevatorToFloorAlgo implements ElevatorController {
    List<Floor> floors;
    List<Elevator> elevators;

    public ClosestElevatorToFloorAlgo(int noOfFloors, int noOfElevators) {
        this.floors = new CopyOnWriteArrayList<>();
        this.elevators = new CopyOnWriteArrayList<>();

        for (int i=0; i <= noOfFloors; i++) {
            this.floors.add(new Floor(i));
        }

        for (int i=0; i < noOfElevators; i++) {
            this.elevators.add(new Elevator(i, noOfFloors));
        }
    }

    @Override
    public void registerHallCommand(ElevatorCommand elevatorCommand, int floorNumber, Direction direction) {
        System.out.println(elevatorCommand + ", " + floorNumber);

        Floor assignFloor = null;
        for (Floor floor : this.floors) {
            if (floor.getFloor() == floorNumber) {
                assignFloor = floor;
                break;
            }
        }

        if (assignFloor == null) {
            throw new InvalidFloor();
        }

        assignFloor.pressButton(direction);

        int distance = Integer.MAX_VALUE;
        Elevator assignElevator = this.elevators.get(0);
        for (Elevator elevator : this.elevators) {
            if (distance >= Math.abs(floorNumber - elevator.getCurrentFloor())) {
                distance = Math.abs(floorNumber - elevator.getCurrentFloor());
                assignElevator = elevator;
            }
        }

        assignElevator.stopAtFloor(floorNumber);
    }

    @Override
    public void registerElevatorCommand(ElevatorCommand elevatorCommand, int elevatorID, int floorNumber) {
        System.out.println(elevatorCommand + ", " + elevatorID + ", " + floorNumber);
        Elevator assignElevator = this.elevators.get(0);
        for (Elevator elevator : this.elevators) {
            if (elevator.getElevatorID() == elevatorID) {
                assignElevator = elevator;
            }
        }

        assignElevator.stopAtFloor(floorNumber);
    }
}
