package com.Patrones.factorymethod.button;

public class WindowsButton implements Button {

    @Override
    public void render() {

        System.out.println("Renderizando un botón estilo Windows.");
    }

    @Override
    public void onClick() {

        System.out.println("Evento de clic en un botón Windows.");

    }
}
