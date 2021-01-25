package br.senai.sp.jandira;

import java.util.Scanner;

import br.senai.sp.jandira.model.Retangulo;

public class App {

	public static void main(String[] args) {
		
		// Criamos um objeto retângulo
		Retangulo retangulo1 = new Retangulo();
		
		// Criamos um objeto para ler a entrada do teclado
		Scanner ler = new Scanner(System.in);
		
		// Solicitamos o valor da altura, e o valor digitado
		// será passado para o método setAltura do retângulo
		System.out.print("Qual a altura do retângulo? ");
		retangulo1.setAltura(ler.nextDouble());
		
		// Solicitamos o valor da base, e o valor digitado
		// será passado para o método setBase do retângulo
		System.out.print("Qual a base do retângulo? ");
		retangulo1.setBase(ler.nextDouble());
		
		// Fechamos o scanner
		ler.close();

		// Exibimos a área e o perímetro do retângulo
		// utilizando os métodos calcularArea() e calcularPerímetro()
		System.out.println("Área do retângulo: " + retangulo1.calcularArea());
		System.out.println("Perímetro do retângulo: " + retangulo1.calcularPerimetro());
	}

}
