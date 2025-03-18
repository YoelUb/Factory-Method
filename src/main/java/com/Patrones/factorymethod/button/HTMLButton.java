package com.Patrones.factorymethod.button;

public class HTMLButton implements Button {

    @Override
    public void render() {

        System.out.println("Renderizando un botón estilo HTML.");
    }

    @Override
    public void onClick() {

        System.out.println("Evento de clic en un botón HTML.");

    }
}
