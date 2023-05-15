package com.lld.elevatorsystem;

import com.lld.elevatorsystem.enums.Direction;
import com.lld.elevatorsystem.model.building.Building;

public class ParkinglotApplication {

	public static void main(String[] args) {
		ElevatorSystem elevatorSystem = new ElevatorSystem();
		elevatorSystem.startElevatorSystem();
	}

}
