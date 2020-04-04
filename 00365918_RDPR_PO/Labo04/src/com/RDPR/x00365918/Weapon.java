package com.RDPR.x00365918;

    public class Weapon extends Resusabetem {
    private String type;
    private double speed;
    private double damage;
    private String wieldType;
    private int level;

        public Weapon(String name, int weight, String descripcion, int remainingUses, String type, double speed, double damage, String wieldType, int level) {
            super(name, weight, descripcion, remainingUses);
            this.type = type;
            this.speed = speed;
            this.damage = damage;
            this.wieldType = wieldType;
            this.level = level;
        }

        public void upgrade(){
        level++;
        speed*=1.125;
        damage*=1.25;
        }

        @Override
        public String toString() {
            return "Weapon{" +
                    "type='" + type + '\'' +
                    ", speed=" + speed +
                    ", damage=" + damage +
                    ", wieldType='" + wieldType + '\'' +
                    ", level=" + level +
                    ", remainingUses=" + remainingUses +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    ", weight=" + weight +
                    ", descripcion='" + descripcion + '\'' +
                    '}';
        }
    }
