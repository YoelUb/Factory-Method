package com.Patrones.factorymethod.dialog;

import com.Patrones.factorymethod.button.Button;
import com.Patrones.factorymethod.button.WindowsButton;
import com.Patrones.factorymethod.checkbox.CheckBox;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    CheckBox createCheckBox() {
        return null;
    }

}
