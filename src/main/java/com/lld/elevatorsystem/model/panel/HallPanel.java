package com.lld.elevatorsystem.model.panel;

import com.lld.elevatorsystem.enums.Direction;
import com.lld.elevatorsystem.model.buttons.Button;
import com.lld.elevatorsystem.model.buttons.HallButton;

public class HallPanel implements Panel {

    int floor;
    Direction direction;
    Button upButton;
    Button downButton;

    public HallPanel(int floor) {
        this.floor = floor;
        upButton = new HallButton("UP");
        downButton = new HallButton("DOWN");
    }

    @Override
    public void pressButton(Button button) {
        if (button.getButtonType().equalsIgnoreCase(upButton.getButtonType())) {
            upButton.setPressed(true);
        } else if (button.getButtonType().equalsIgnoreCase(downButton.getButtonType())) {
            downButton.setPressed(true);
        } else {
            System.out.println("Invalid hall button pressed");
        }
    }

    @Override
    public void display() {
        System.out.println(this.direction + ", " + this.floor);
    }
}
