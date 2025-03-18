package com.Patrones.factorymethod.dialog;

import com.Patrones.factorymethod.button.Button;
import com.Patrones.factorymethod.checkbox.CheckBox;

public abstract class Dialog {
    //Fabrica
    abstract Button createButton();
    abstract CheckBox createCheckBox();

    public void render() {
        Button okButton = createButton();
        CheckBox checkBox = createCheckBox();
        okButton.onClick();
        okButton.render();
    }
}
