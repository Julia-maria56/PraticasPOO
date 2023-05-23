package br.edu.figurasgeometricasespaciais;
import java.util.Scanner;

public class Paralelepipedo extends FigEspaciais {
	
	Scanner sc = new Scanner(System.in);


	private double aresta1;
	private double aresta2;
	private double areabase;
	private double altura;
	private double arealateral;

	
	public Paralelepipedo() {
		aresta1 = 0.0;
		aresta2 = 0.0;
		areabase = 0.0;
		altura = 0.0;
		areaTotal = 0.0;
		arealateral = 0.0;
		volume = 0.0;
	}
	
	public void calcAreaBase() {
		areabase = (aresta1 * aresta2);
	}
	public void calcAreaLateral() {
		arealateral = (2 * (aresta1 * altura)) + (2 * (aresta2 * altura));
	}

	
	public void calcAreaTotal() {
		areaTotal = arealateral * 2 *areabase;
		System.out.println("O valor da área é: " + areaTotal);
		System.out.println(" ");
	}
	
	public void calcVolume() {
		volume = areabase * altura;
		System.out.println("O valor do volume é: " + volume);
		System.out.println(" ");
	}

	
	public void setListaAtributos() {
		System.out.println("Digite o valor da primeira aresta da base: ");
		aresta1 = sc.nextDouble();
		System.out.println("Digite o valor da segunda aresta da base: ");
		aresta2 = sc.nextDouble();
		System.out.println("Digite o valor da altura do prisma: ");
		altura = sc.nextDouble();
		System.out.println("O valor da primeira aresta da base é: "+aresta1);
		System.out.println("O valor da segunda aresta da base é: "+aresta2);

		
	  
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
