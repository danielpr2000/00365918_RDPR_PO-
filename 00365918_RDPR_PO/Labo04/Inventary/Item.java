package com.RDPR.x00365918;

    public abstract class Item {
    protected int id;
    protected String name;
    protected int weight;
    protected String descripcion;

        public Item(){
        }

        public Item(String name, int weight, String descripcion) {
            this.id= IdGenerador.newID();
            this.name = name;
            this.weight = weight;
            this.descripcion = descripcion;
        }

        public int getId() {
            return id;
        }
    }
