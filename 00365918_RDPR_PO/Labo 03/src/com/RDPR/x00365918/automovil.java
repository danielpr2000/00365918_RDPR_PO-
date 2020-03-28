package com.RDPR.x00365918;

import javax.swing.*;
public class automovil {
    private String placa,hora;
    public automovil(String placa,String hora) {
        this.hora=hora;
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }

    public String getHora() {
        return hora;
    }
}