package com.Patrones.factorymethod.checkbox;

public class WindowsCheckBox implements CheckBox {

    @Override
    public void render() {

        System.out.println("Renderizando un checkbox estilo Windows.");

    }

    @Override
    public void onClick() {
        System.out.println("Evento de selección en un checkbox Windows.");
    }
}
