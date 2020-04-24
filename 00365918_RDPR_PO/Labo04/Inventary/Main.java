package com.RDPR.x00365918;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Item> PersonaItems = new ArrayList();
        ArrayList<Item> Commonitems = new ArrayList();

        String menu1= "1. Agregar ítem\n"+
                "2. Compartir ítem\n"+
                "3. Buscar ítem por ID \n"+
                "4. Buscar ítem por tipo\n"+
                "5. Borrar ítem por ID\n"+
                "6. Borrar ítem por tipo\n"+
                "0. Salir\n"+
                "Su opcion: ";

        String menu2= "Agregar:\n" +
                "1. Arma\n"+
                "2. Municion\n"+
                "3. Pocion\n"+
                "4. Elixir\n"+
                "0. Salir\n"+
                "Su opcion: ";

        int opcion = 0;
        int opcionItem = 0;


        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu1));

            switch (opcion) {

                case 1:
                    do {
                        opcionItem=Integer.parseInt(JOptionPane.showInputDialog(null, menu2));

                        switch (opcionItem){
                            case 1: PersonaItems.add(anadirWeapon());break;
                            case 2: PersonaItems.add(anadirAmmo());break;
                            case 3: PersonaItems.add(anadirPocion());break;
                            case 4: PersonaItems.add(anadirElixir());break;
                        }

                    } while (opcionItem != 0);
                    break;

                case 2:
                    int buscarID =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese ID a compartir"));
                    PersonaItems.forEach(obj ->{
                        if (obj.getId()==buscarID){
                            Commonitems.add(obj);
                            JOptionPane.showMessageDialog(null,"Se compartido exitosamente");
                        } });
                 break;

                case 3:
                        int lista=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 1: si desea buscar en la lista PersonalItems\n"
                                +"Digite 2: si desea buscar en la CommonItems"));

                        switch(lista) {

                            case 1:
                                int buscarID2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese ID a compartir"));
                                PersonaItems.forEach(obj -> {
                                    if (obj.getId() == buscarID2) {

                                        JOptionPane.showMessageDialog(null, obj.toString());
                                    } });
                             break;

                            case 2:
                                int buscarID02 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese ID a compartir"));
                                Commonitems.forEach(obj -> {
                                    if (obj.getId() == buscarID02) {
                                        JOptionPane.showMessageDialog(null, obj.toString());
                                    } });
                             break;

                        }
                 break;

                case 4: int lista2=Integer.parseInt(JOptionPane.showInputDialog(null,"1: Acceder a PersonalItmes\n"
                            +"2: Acceder a CommonItems"));

                        String menu3="1.Acceder a instacia Weapon\n"
                                +"2.Acceder a instacia Ammo\n"
                                +"3.Acceder a instacia Potion\n"
                                +"4.Acceder a instacia Exilir\n";

                    if (lista2 == 1) {

                        int op=Integer.parseInt(JOptionPane.showInputDialog(null,menu3));
                            switch (op){
                                case 1:
                                        PersonaItems.forEach(obj ->{
                                            if (obj instanceof Weapon) {
                                                JOptionPane.showMessageDialog(null,obj.toString());
                                            } });
                                break;
                                case 2:
                                        PersonaItems.forEach(obj ->{
                                            if (obj instanceof Ammo) {
                                            JOptionPane.showMessageDialog(null,obj.toString());
                                             } });
                                break;
                                case 3:
                                         PersonaItems.forEach(obj ->{
                                            if (obj instanceof Potion) {
                                            JOptionPane.showMessageDialog(null,obj.toString());
                                             } });
                                break;
                                case 4:
                                        PersonaItems.forEach(obj ->{
                                            if (obj instanceof Elixir) {
                                            JOptionPane.showMessageDialog(null,obj.toString());
                                             } });
                                break;
                            }


                    }else{

                        int opp=Integer.parseInt(JOptionPane.showInputDialog(null,menu3));
                        switch (opp){
                            case 1:
                                Commonitems.forEach(obj ->{
                                    if (obj instanceof Weapon) {
                                        JOptionPane.showMessageDialog(null,obj.toString());
                                    } });
                                break;
                            case 2:
                                Commonitems.forEach(obj ->{
                                    if (obj instanceof Ammo) {
                                        JOptionPane.showMessageDialog(null,obj.toString());
                                    } });
                                break;
                            case 3:
                                Commonitems.forEach(obj ->{
                                    if (obj instanceof Potion) {
                                        JOptionPane.showMessageDialog(null,obj.toString());
                                    } });
                                break;
                            case 4:
                                Commonitems.forEach(obj ->{
                                    if (obj instanceof Elixir) {
                                        JOptionPane.showMessageDialog(null,obj.toString());
                                    } });
                                break;
                            }
                    }
                    break;

                case 5:int lista3=Integer.parseInt(JOptionPane.showInputDialog(null,"1: Acceder a PersonalItmes\n"
                        +"2: Acceder a CommonItems"));
                        if(lista3==1){

                            int idBuscar = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Digite ID a buscar: "));
                            final int aux=idBuscar;

                            PersonaItems.removeIf(obj ->{
                                if(obj.getId()==aux) {

                                    JOptionPane.showMessageDialog(null,"Se ha Eliminado el Item");
                                return true;
                                }return false;
                            });

                        }else{

                            int idBuscar = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Digite ID a buscar: "));
                                final int aux1=idBuscar;
                            Commonitems.removeIf(obj ->{
                                if(obj.getId()==aux1) {

                                    JOptionPane.showMessageDialog(null,"Se ha Eliminado el Item");
                                    return true;
                                }  return false;
                            });

                        }

                break;
                case 6:
                    int lista4=Integer.parseInt(JOptionPane.showInputDialog(null,"1: Acceder a PersonalItmes\n"
                            +"2: Acceder a CommonItems"));

                    String menu4="1.Accder a instacia Weapon\n"
                            +"2.Acceder a instacia Ammo\n"
                            +"3.Acceder a instacia Potion\n"
                            +"4.Acceder a instacia Exilir";

                    if (lista4 == 1) {

                        int op2=Integer.parseInt(JOptionPane.showInputDialog(null,menu4));
                        switch (op2){
                            case 1:
                                PersonaItems.removeIf(obj ->{
                                    if (obj instanceof Weapon) {
                                        JOptionPane.showMessageDialog(null,"Se ha Eliminado los Item de isntacia Weapon");
                                        return  true;
                                    }
                                    return false;
                                });
                                break;
                            case 2:
                                   PersonaItems.removeIf(obj ->{
                                    if (obj instanceof Ammo) {
                                        JOptionPane.showMessageDialog(null,"Se ha Eliminado los Item de isntacia Ammo");
                                        return true;
                                    }
                                    return false;
                                });
                                break;
                            case 3:
                                PersonaItems.removeIf(obj ->{
                                    if (obj instanceof Potion) {
                                        JOptionPane.showMessageDialog(null,"Se ha Eliminado los Item de isntacia Potion");
                                        return true;
                                    }
                                    return false;
                                });
                                break;
                            case 4:
                                PersonaItems.removeIf(obj ->{
                                    if (obj instanceof Elixir) {
                                        JOptionPane.showMessageDialog(null,"Se ha Eliminado los Item de isntacia Elixir");
                                        return true;
                                    }
                                    return false;
                                });
                                break;
                        }

                    }else{

                        int opp=Integer.parseInt(JOptionPane.showInputDialog(null,menu4));
                        switch (opp){
                            case 1:
                                Commonitems.removeIf(obj ->{
                                    if (obj instanceof Weapon) {
                                        JOptionPane.showMessageDialog(null,"Se ha Eliminado los Item de isntacia Weapon");
                                        return true;
                                    }
                                    return false;
                                });
                                break;
                            case 2:
                                Commonitems.removeIf(obj ->{
                                    if (obj instanceof Ammo) {
                                        JOptionPane.showMessageDialog(null,"Se ha Eliminado los Item de isntacia Ammo");
                                        return true;
                                    }
                                    return false;
                                });
                                break;
                            case 3:
                                Commonitems.removeIf(obj ->{
                                    if (obj instanceof Potion) {
                                        JOptionPane.showMessageDialog(null,"Se ha Eliminado los Item de isntacia Potion");
                                        return true;
                                    }
                                    return false;
                                });
                                break;
                            case 4:
                                Commonitems.removeIf(obj ->{
                                    if (obj instanceof Elixir) {
                                        JOptionPane.showMessageDialog(null,"Se ha Eliminado los Item de instacia Elixir");
                                        return true;
                                    }
                                    return false;
                                });
                                break;
                        }
                    }
                    break;
                    //CASE 7 NO ESTA EN EL MENU PERO SE LO AGREGE NADA MAS POR SI ME QUERIA SABER EL ID
                    //ALGUN OBJETO Y PARA COMPARTIRLO DUPLICARLO O ALGO
                case 7: PersonaItems.forEach(obj ->{
                    JOptionPane.showMessageDialog(null,obj.toString());
                });
                    Commonitems.forEach(obj ->{
                    JOptionPane.showMessageDialog(null,obj.toString());
                });
                break;
            }

        } while (opcion != 0);

    }

    static Item anadirPocion() {

        String name = JOptionPane.showInputDialog(null, "Nombre: ");
        int weight  = Integer.parseInt(JOptionPane.showInputDialog(null,"Peso: "));
        String descripcion= JOptionPane.showInputDialog(null, "Descripcion: ");
        int reuseTime =Integer.parseInt(JOptionPane.showInputDialog(null,"Tiempo de Reuso: "));

        //////////////////////////////////////////////ELIGIENDO EL LEVEL/////////////////////////////////////////////////
        String level="A ElECCION EN EL SWITCH";
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca el numero del level a elegir:\n" +
                    "1.Minor\n"+"2.Normal\n"+"3.Mayor\n"));

            switch(opc){

                case 1: level="Minor";opc=-999;
                    break;
                case 2: level="Normal";opc=-999;
                    break;
                case 3:level="Mayor";opc=-999;
                    break;
                default:JOptionPane.showMessageDialog(null,"Su opcion es invalida");break;
            }

        }while (opc!=-999);
        //////////////////////////////////////////////ELIGIENDO EL TYPE/////////////////////////////////////////////////
        String type="A ELLECCION EN EL SWITCH";
        int opc2;
        do{

            opc2 = Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca el numero del Tipo a elegir:\n" +
                    "1.Mana\n"+"2.Life\n"));

            switch(opc2){

                case 1: type="Mana";opc2=-999;
                    break;
                case 2: type="Life";opc2=-999;
                    break;
                default:JOptionPane.showMessageDialog(null,"Su opcion es invalida");break;
            }

        }while (opc!=-999);

        int amount= Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad: "));

        return new Potion(name,weight,descripcion,reuseTime,level,type,amount);
    }

    static Item anadirElixir() {


        String name = JOptionPane.showInputDialog(null, "Nombre: ");
        int weight  = Integer.parseInt(JOptionPane.showInputDialog(null,"Peso: "));
        String descripcion = JOptionPane.showInputDialog(null, "Descripcion: ");
        int reuseTime =Integer.parseInt(JOptionPane.showInputDialog(null,"Tiempo de Reuso: "));
        //////////////////////////////////////////////ELIGIENDO EL LEVEL/////////////////////////////////////////////////
        String level="A ElECCION EN EL SWITCH";
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca el numero del level a elegir:\n" +
                    "1.Minor\n"+"2.Normal\n"+"3.Mayor\n"));

            switch(opc){

                case 1: level="Minor";opc=-999;
                    break;
                case 2: level="Normal";opc=-999;
                    break;
                case 3:level="Mayor";opc=-999;
                    break;
                default:JOptionPane.showMessageDialog(null,"Su opcion es invalida");break;
            }

        }while (opc!=-999);
        //////////////////////////////////////////////ELIGIENDO EL TYPE/////////////////////////////////////////////////
        String type="A ELLECCION EN EL SWITCH";
        int opc2;
        do{
            opc2 = Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca el numero del tipo a elegir:\n" +
                    "1.Mana\n"+"2.Life\n"));

            switch(opc2){

                case 1: type="Mana";opc2=-999;
                    break;
                case 2: type="Life";opc2=-999;
                    break;
                default:JOptionPane.showMessageDialog(null,"Su opcion es invalida");break;
            }

        }while (opc2!=-999);

        int amount= Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad: "));
        int time=Integer.parseInt(JOptionPane.showInputDialog(null,"Tiempo: "));

        return new Elixir(name,weight,descripcion,reuseTime,level,type,amount,time);
    }

    static Item anadirAmmo() {

        String name = JOptionPane.showInputDialog(null, "Nombre: ");
        int weight  = Integer.parseInt(JOptionPane.showInputDialog(null,"Peso: "));
        String descripcion= JOptionPane.showInputDialog(null, "Descripcion: ");
        int remainingUses =Integer.parseInt(JOptionPane.showInputDialog(null,"Usos Restante: "));
        boolean equipped;
        String decision=JOptionPane.showInputDialog(null, "Equipado: Si o No");
        if(decision.equalsIgnoreCase("si")==true){
            equipped=true;
        }else{
            equipped=false;
        }
        return new Ammo(name,weight,descripcion,remainingUses,equipped);
    }

    static Item anadirWeapon() {
        String name = JOptionPane.showInputDialog(null, "Nombre: ");
        int weight  = Integer.parseInt(JOptionPane.showInputDialog(null,"Peso: "));
        String descripcion= JOptionPane.showInputDialog(null, "Descripcion: ");
        int remainingUses =Integer.parseInt(JOptionPane.showInputDialog(null,"Usos Restante: "));
        //////////////////////////////////ELECCION DE TYPE////////////////////////////////////////
        String type="A ElECCION EN EL SWITCH";
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca el numero del level a elegir:\n" +
                    "1.Bow\n"+"2.Sword\n"+"3.Staff\n"+"4.Orb\n"+"5.Dagger\n"));

            switch(opc){

                case 1: type="Bow";opc=-999;
                    break;
                case 2: type="Sword";opc=-999;
                    break;
                case 3:type="Staff";opc=-999;
                    break;
                case 4:type="Orb";opc=-999;
                    break;
                case 5:type="Dagger" ;opc=-999;
                    break;
                default:JOptionPane.showMessageDialog(null,"Su opcion es invalida");break;
            }
        }while (opc!=-999);

        double speed= Double.parseDouble(JOptionPane.showInputDialog(null,"velocidad: "));
        double damage= Double.parseDouble(JOptionPane.showInputDialog(null,"Daño: "));
        //////////////////////////////////ELECCION DE WHIELTYPE/////////////////////////////////////////////////////////
        String wieldType = "ElECCION EN SWITCH";
        int opc2;
        do{
            opc2 = Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca el numero del level a elegir:\n" +
                    "1.One-Handle\n"+"2.Two-Hand\n"));
            switch(opc2){

                case 1: wieldType="One-Handed";opc2=-999;
                    break;
                case 2: wieldType="Two-Handed";opc2=-999;
                    break;
                default:JOptionPane.showMessageDialog(null,"Su opcion es invalida");break;
            }

        }while (opc2!=-999);
        int level= Integer.parseInt(JOptionPane.showInputDialog(null,"level: "));

        return new Weapon(name,weight,descripcion,remainingUses,type,speed,damage,wieldType,level);
    }

}
