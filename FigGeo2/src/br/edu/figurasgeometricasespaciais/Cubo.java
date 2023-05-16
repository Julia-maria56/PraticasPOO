package br.edu.figurasgeometricasespaciais;
import java.util.Scanner;

public class Cubo extends FigEspaciais {
	Scanner sc = new Scanner (System.in);

	private double aresta;
	
	public Cubo() {
		areaTotal = 0;
		aresta = 0;
		volume = 0.0;
	}
	
	public void calcVolume() {
		volume = (aresta * aresta  * aresta);
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + volume);
		System.out.println(" ");
	}

	public void setListaAtributos() {
		System.out.println("Digite o valor da aresta: ");
		aresta = sc.nextDouble();

	}
	
	public double getArea() {
		return areaTotal;
	}

	public double getVolume() {
		return volume;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
