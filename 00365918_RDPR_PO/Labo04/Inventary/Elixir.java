package com.RDPR.x00365918;

import javax.swing.*;

public class Elixir extends Healthltem{
    private int amount;
    private int time;

    public Elixir(String name, int weight, String descripcion, int reuseTime, String level, String type, int amount, int time) {
        super(name, weight, descripcion, reuseTime, level, type);
        this.amount = amount;
        this.time = time;
    }

    public void drink(){
        JOptionPane.showMessageDialog(null,"ha bebido el item");
        amount--;
    }

    @Override
    public String toString() {
        return "Elixir{" +
                "amount=" + amount +
                ", time=" + time +
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
