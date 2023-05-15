package com.lld.elevatorsystem.model.elevator;

import com.lld.elevatorsystem.enums.Direction;
import com.lld.elevatorsystem.model.panel.CarPanel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Elevator {

    int elevatorID;
    CarPanel panel;
    Door door;
    int noOfFloors;

    public Elevator(int id, int noOfFloors) {
        this.elevatorID = id;
        this.panel = new CarPanel();
        this.panel.initializeCarPanel(noOfFloors);
        this.door = new Door();
        this.noOfFloors = noOfFloors;
    }

    public void stopAtFloor(int floor) {
        if (!isValidFloor(floor)) {
            System.out.println("Invalid Floor !!!!!!");
        }
        door.openDoor();
        System.out.println("People enter in elevator car: " + elevatorID);
        panel.setFloor(floor);
        if (floor > getCurrentFloor()) {
            panel.setDirection(Direction.UP);
        } else {
            panel.setDirection(Direction.DOWN);
        }
        door.closeDoor();
    }

    private boolean isValidFloor(int floor) {
        return floor >= 0 && floor <= noOfFloors;
    }

    public int getCurrentFloor() {
        return this.panel.getFloor();
    }
}
