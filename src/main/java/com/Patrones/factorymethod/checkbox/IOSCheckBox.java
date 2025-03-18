package com.Patrones.factorymethod.checkbox;


public class IOSCheckBox implements CheckBox {

    @Override
    public void render() {
        System.out.println("Renderizando un checkbox IOS.");
    }

    @Override
    public void onClick() {
        System.out.println("Evento de selección en un checkbox IOS.");

    }
}
