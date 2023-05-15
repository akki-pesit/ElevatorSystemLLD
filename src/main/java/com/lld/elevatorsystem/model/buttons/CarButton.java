package com.lld.elevatorsystem.model.buttons;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CarButton extends Button {

    public CarButton(String buttonType) {
        this.buttonType = buttonType;
        this.isPressed = false;
    }

    @Override
    public void pressButton() {
        System.out.println("Car Button: " + this.buttonType + ", pressed");
    }


}
