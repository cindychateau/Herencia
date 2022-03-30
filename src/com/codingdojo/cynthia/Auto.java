package com.codingdojo.cynthia;

public class Auto extends Vehiculo{
	
	private String placas;

	public Auto(int anio, String marca, String modelo, String color, int ruedas, String placas) {
		super(anio, marca, modelo, color, ruedas);
		this.placas = placas;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	public void informacion() {
		//super.informacion();
		System.out.println("Este es un auto");
		System.out.println("Placas:"+placas);
	}
	
	public String info() {
		String inf = super.info();
		return inf+" Placas:"+placas;
	}
	
}
