package com.RDPR.x00365918;

public final class IdGenerador {

    private static int counter=0;

    private IdGenerador() {
    }

    public static int newID(){
        return ++counter;
    }

}
