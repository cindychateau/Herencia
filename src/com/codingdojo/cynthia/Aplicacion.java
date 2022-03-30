package com.codingdojo.cynthia;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto1 = new Auto(2010, "Honda", "Civic", "rojo", 4, "1234ABC");
		
		String auto1Marca = auto1.getMarca();
		String auto1Modelo = auto1.getModelo();
		
		System.out.println(auto1.info());
		
		auto1.acelerar();
		auto1.acelerar();
		auto1.acelerar();
		
		auto1.desacelerar();
		
		System.out.println("----------");
		
		/*Vehiculo bici = new Vehiculo(2015, "MarcaBici", "Nuevo modelo", "blanca",2);
		
		String biciMarca = bici.getMarca();
		String biciModelo = bici.getModelo();
		
		//bici.informacion();
		
		String info = bici.info();*/
		
		Bicicleta bici = new Bicicleta(2015, "Apache", "M55", "blanca",2);
		
		bici.acelerar();
		bici.acelerar();
		
		bici.desacelerar();
		
	}

}
