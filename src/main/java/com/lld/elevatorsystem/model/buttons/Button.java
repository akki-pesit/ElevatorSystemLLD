package com.lld.elevatorsystem.model.buttons;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Button {

    String buttonType;
    boolean isPressed;

    abstract void pressButton();

    boolean isPressed() {
        return this.isPressed;
    }
}
