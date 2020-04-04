package com.RDPR.x00365918;

import javax.swing.*;

public class Potion extends Healthltem{
    private int amount;

    public void drink(){
        JOptionPane.showMessageDialog(null,"ha bebido el item");
        amount--;
    }

    public Potion(String name, int weight, String descripcion, int reuseTime, String level, String type, int amount) {
        super(name, weight, descripcion, reuseTime, level, type);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "amount=" + amount +
                ", reuseTime=" + reuseTime +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
