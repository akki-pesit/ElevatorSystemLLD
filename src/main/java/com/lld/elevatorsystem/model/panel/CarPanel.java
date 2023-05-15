package com.lld.elevatorsystem.model.panel;

import com.lld.elevatorsystem.enums.Direction;
import com.lld.elevatorsystem.model.buttons.Button;
import com.lld.elevatorsystem.model.buttons.CarButton;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class CarPanel implements Panel {

    List<Button> buttons;
    int floor;
    Direction direction;

    public void initializeCarPanel(int buildingSize) {
        buttons = new ArrayList<>();
        for (int i=0; i<=buildingSize; i++) {
            this.buttons.add(new CarButton(String.valueOf(i)));
        }
        this.buttons.add(new CarButton("UP"));
        this.buttons.add(new CarButton("DOWN"));
        this.floor = 0;
        this.direction = Direction.UP;
    }

    @Override
    public void pressButton(Button button) {
        for (Button carButton: buttons) {
            if (carButton.getButtonType().equalsIgnoreCase(button.getButtonType())) {
                carButton.setPressed(false);
            }
        }

        System.out.println("Button: " + button.getButtonType() + ", not found");
    }

    @Override
    public void display() {
        System.out.println(this.direction + ", " + this.floor);
    }
}
