package com.lld.elevatorsystem.model.building;

import com.lld.elevatorsystem.enums.Direction;
import com.lld.elevatorsystem.exception.InvalidCommand;
import com.lld.elevatorsystem.model.buttons.HallButton;
import com.lld.elevatorsystem.model.panel.HallPanel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Floor {
    int floor;
    HallPanel hallPanel;

    public Floor(int floor) {
        this.floor = floor;
        this.hallPanel = new HallPanel(floor);
    }

    public void pressButton(Direction direction) {
        switch (direction) {
            case UP: hallPanel.pressButton(new HallButton("UP"));
            return;
            case DOWN: hallPanel.pressButton(new HallButton("DOWN"));
            return;
            default: throw new InvalidCommand();
        }
    }
}
