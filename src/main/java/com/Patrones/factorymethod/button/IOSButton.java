package com.Patrones.factorymethod.button;

public class IOSButton implements Button {

    @Override
    public void render() {
        System.out.println("Renderizando un botón IOS.");

    }

    @Override
    public void onClick() {
        System.out.println("Evento de clic en un botón IOS.");

    }
}
