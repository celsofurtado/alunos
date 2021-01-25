package br.senai.sp.jandira.model;

public class Retangulo {

	// Atributos da classe retângulo
	private double base;
	private double altura;

	// Métodos de acesso (get/set) da classe retângulo
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

	// Métodos que retornam a área e perímetro do retângulo
	public double calcularArea() {
		return this.base * this.altura;
	}
	
	public double calcularPerimetro() {
		return 2 * (this.base + this.altura);
	}

}
