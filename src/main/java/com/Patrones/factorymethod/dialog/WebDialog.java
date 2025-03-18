package com.Patrones.factorymethod.dialog;

import com.Patrones.factorymethod.button.Button;
import com.Patrones.factorymethod.button.HTMLButton;
import com.Patrones.factorymethod.checkbox.CheckBox;

public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        return new HTMLButton();
    }

    @Override
    CheckBox createCheckBox() {
        return null;
    }
}
