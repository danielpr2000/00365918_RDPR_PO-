package com.RDPR.x00365918;

import javax.swing.*;

public abstract class Resusabetem extends Item {

    protected int remainingUses;

    public Resusabetem(String name, int weight, String descripcion, int remainingUses) {
        super(name, weight, descripcion);
        this.remainingUses = remainingUses;
    }

    public void reduceUse() {
        remainingUses--;
    }

    public boolean use(){
        boolean use;
        String decision= JOptionPane.showInputDialog(null, "Equipado: Si o No");
        if(decision.equalsIgnoreCase("si")==true){
            use=true;
        }else{
            use=false;
        }

        return use;
    }
}
