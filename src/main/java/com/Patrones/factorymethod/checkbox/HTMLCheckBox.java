package com.Patrones.factorymethod.checkbox;

public class HTMLCheckBox implements CheckBox {

    @Override
    public void render() {
        System.out.println("Renderizando un checkbox HTML.");
    }

    @Override
    public void onClick() {
        System.out.println("Evento de selección en un checkbox HTML.");

    }
}
