package com.lld.elevatorsystem.model.panel;

import com.lld.elevatorsystem.model.buttons.Button;

public interface Panel {
    void pressButton(Button button);
    void display();
}
