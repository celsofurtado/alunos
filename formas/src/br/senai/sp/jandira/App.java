package br.senai.sp.jandira;

import java.util.Scanner;

import br.senai.sp.jandira.model.Retangulo;

public class App {

	public static void main(String[] args) {
		
		// Criamos um objeto ret�ngulo
		Retangulo retangulo1 = new Retangulo();
		
		// Criamos um objeto para ler a entrada do teclado
		Scanner ler = new Scanner(System.in);
		
		// Solicitamos o valor da altura, e o valor digitado
		// ser� passado para o m�todo setAltura do ret�ngulo
		System.out.print("Qual a altura do ret�ngulo? ");
		retangulo1.setAltura(ler.nextDouble());
		
		// Solicitamos o valor da base, e o valor digitado
		// ser� passado para o m�todo setBase do ret�ngulo
		System.out.print("Qual a base do ret�ngulo? ");
		retangulo1.setBase(ler.nextDouble());
		
		// Fechamos o scanner
		ler.close();

		// Exibimos a �rea e o per�metro do ret�ngulo
		// utilizando os m�todos calcularArea() e calcularPer�metro()
		System.out.println("�rea do ret�ngulo: " + retangulo1.calcularArea());
		System.out.println("Per�metro do ret�ngulo: " + retangulo1.calcularPerimetro());
	}

}
