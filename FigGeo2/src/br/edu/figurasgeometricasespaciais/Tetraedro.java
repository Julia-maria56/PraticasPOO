package br.edu.figurasgeometricasespaciais;
import java.util.Scanner;

public class Tetraedro extends FigEspaciais {
	Scanner sc = new Scanner (System.in);
	
	private double aresta;
	private double altura;
	
	public Tetraedro() {
		areaTotal  = 0.0;
		altura = 0.0;
		volume = 0.0;
	}
	
	public void calcAreaToral() {
		areaTotal  = 4 * ((aresta * altura) / 2);
	}
	
	public void calcVolume() {
		volume = 1/3 * (areaTotal / 4);
	}

	public void setListaAtributos() {
		System.out.println("Digite o valor da altura: ");
		altura  = sc.nextDouble();
		System.out.println("Digite o valor da aresta: ");
		aresta  = sc.nextDouble();
		System.out.println(" ");

		System.out.println("O valor da altura é: "+ altura);
		System.out.println("O valor do volume é: "+ volume);


	}
	public double getArea() {
		System.out.println("O valor da área é: "+areaTotal);
		return areaTotal;
	}
	
	public double getVolume() {
		System.out.println("O valor do volume é: "+volume);
		return volume;
	}		
}
	
	
	
	
	
	
	


