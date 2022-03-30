package com.codingdojo.cynthia;

public interface manejarVehiculo {
	
	double aumento = 2;
	
	//*Método abstracto nos OBLIGA e implementar una funcionalidad en la clase hija*
	//Método default: implementamos en la interface y no hay necesidad de implementar clase hija
	//Método estático: pertenece a la interface
	
	abstract void acelerar();
	abstract void desacelerar();
	
}
