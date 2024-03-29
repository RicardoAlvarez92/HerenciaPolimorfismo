package com.generation.animales;


public abstract class Animal {

    protected String nombre;
    protected int edad;
    public Animal () {

    }

    public Animal (String nombre) {
        this.nombre = nombre;
    }

    public Animal (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void comunicarse(){
    System.out.println("Hola");
    }

    public void comer(){
        System.out.println("Estoy comiendo");
    }

    public abstract void respirar();
}
