package com.codingdojo.cynthia;

public class Bicicleta extends Vehiculo implements manejarVehiculo{
	
	public Bicicleta(int anio, String marca, String modelo, String color, int ruedas) {
		super(anio, marca, modelo, color, ruedas);
	}
	
	public void acelerar() {
		System.out.println("Voy a acelerar!");
		velocidad += .5;
		System.out.println("Mi velocidad es de:"+velocidad);
	}
	
	public void desacelerar() {
		System.out.println("Voy a bajar m velocidad! Pero primero bajo despacio mis pies");
		velocidad -= .5;
		System.out.println("Mi velocidad es de:"+velocidad);
	}
	
}
