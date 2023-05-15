package com.lld.elevatorsystem.model.elevator;

public class Door {
    boolean isOpened;

    void openDoor() {
        this.isOpened = true;
    }

    void closeDoor() {
        this.isOpened = false;
    }
}
