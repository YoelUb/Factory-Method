package com.Patrones.factorymethod.dialog;

import com.Patrones.factorymethod.button.Button;
import com.Patrones.factorymethod.button.IOSButton;
import com.Patrones.factorymethod.checkbox.CheckBox;

public class IOSDialog extends Dialog {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    CheckBox createCheckBox() {
        return null;
    }
}
