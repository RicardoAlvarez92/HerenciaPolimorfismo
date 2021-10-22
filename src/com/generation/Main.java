package com.generation;
import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {

	Ave ave = new Ave("petirrojo");
	Ave ave2 = new Ave();
	ave.comunicarse();
	ave.hacerNido();
	ave.comer();
	ave.respirar();

	System.out.println("-----------------------------------------------");
	Perro perro = new Perro("pulgas");
	perro.jugar();
	perro.ladrar();
	perro.comer();
	perro.respirar();
    }
}
