package com.RDPR.x00365918;

import javax.swing.*;

        public abstract class Healthltem extends Item{
        protected int reuseTime;
        protected String level;
        protected String type;

        public Healthltem(String name, int weight, String descripcion, int reuseTime, String level, String type) {
                super(name, weight, descripcion);
                this.reuseTime = reuseTime;
                this.level = level;
                this.type = type;
            }



             abstract void drink();

    }
