package com.Patrones.factorymethod.dialog;

import com.Patrones.factorymethod.button.Button;
import com.Patrones.factorymethod.button.WindowsButton;
import com.Patrones.factorymethod.checkbox.CheckBox;
import com.Patrones.factorymethod.checkbox.WindowsCheckBox;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

}
