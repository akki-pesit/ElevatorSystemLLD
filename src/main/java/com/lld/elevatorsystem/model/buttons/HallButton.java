package com.lld.elevatorsystem.model.buttons;

public class HallButton extends Button {

    public HallButton(String buttonType) {
        this.buttonType = buttonType;
    }

    @Override
    public void pressButton() {
        System.out.println("Hall Button: " + buttonType + ", pressed");
    }
}
