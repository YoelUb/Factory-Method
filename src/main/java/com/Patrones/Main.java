package com.Patrones;

import com.Patrones.factorymethod.dialog.WebDialog;
import com.Patrones.factorymethod.dialog.WindowsDialog;
import com.Patrones.factorymethod.dialog.IOSDialog;
import com.Patrones.factorymethod.dialog.Dialog;



class Main {
    private static Dialog dialog;

    public static void initialize(String os) {
        if (os.equalsIgnoreCase("Windows")) {
            dialog = new WindowsDialog();
        } else if (os.equalsIgnoreCase("Web")) {
            dialog = new WebDialog();
        } else if (os.equalsIgnoreCase("iOS")) {
            dialog = new IOSDialog();
        } else {
            throw new RuntimeException("Error! Unknown operating system.");
        }
    }

    public static void main(String[] args) {
        String os = "Windows";
        initialize(os);
        dialog.render();
    }
}
