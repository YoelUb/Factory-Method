package com.Patrones.factorymethod.dialog;

import com.Patrones.factorymethod.button.Button;
import com.Patrones.factorymethod.button.HTMLButton;
import com.Patrones.factorymethod.checkbox.CheckBox;
import com.Patrones.factorymethod.checkbox.HTMLCheckBox;

public class HTMLDialog extends Dialog {

    @Override
    Button createButton() {
        return new HTMLButton();
    }

    @Override
    CheckBox createCheckBox() {
        return new HTMLCheckBox();
    }
}
