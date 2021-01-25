package br.senai.sp.jandira.model;

public class Retangulo {

	// Atributos da classe ret�ngulo
	private double base;
	private double altura;

	// M�todos de acesso (get/set) da classe ret�ngulo
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// M�todos que retornam a �rea e per�metro do ret�ngulo
	public double calcularArea() {
		return this.base * this.altura;
	}
	
	public double calcularPerimetro() {
		return 2 * (this.base + this.altura);
	}

}
