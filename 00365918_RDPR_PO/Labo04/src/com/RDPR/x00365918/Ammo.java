package com.RDPR.x00365918;

import java.lang.management.GarbageCollectorMXBean;

public class Ammo extends Resusabetem {
    private boolean equipped;

    public Ammo(String name, int weight, String descripcion, int remainingUses, boolean equipped) {
        super(name, weight, descripcion, remainingUses);
        this.equipped = equipped;
    }

    public void equip(){
        if(equipped==true){
            equipped=false;
        }else{
        equipped=true;
        }
    }

    @Override
    public String toString() {
        return "Ammo{" +
                "equipped=" + equipped +
                ", remainingUses=" + remainingUses +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
