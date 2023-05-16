package br.edu.figurasgeometricasespaciais;
import java.util.Scanner; 

public class Prisma extends FigEspaciais {
	
	Scanner sc = new Scanner(System.in);


	private double arestabase;
	private double areabase;
	private double alturaprisma;
	private double alturabase;
	private double arealateral;
	
	public Prisma() {
		arestabase = 0.0;
		areabase = 0.0;
		alturaprisma = 0.0;
		areaTotal = 0.0;
		arealateral = 0.0;
		volume = 0.0;
		alturabase = 0.0;
	}
	
	public void calcAreaBase() {
		alturabase = (arestabase * Math.sqrt(3)) / 2;
		areabase = (arestabase * alturabase) / 2;
		System.out.println("O valor da área da base é: " + areabase);
		System.out.println(" ");
	}
	
	public void calcAreaLateral() {
		arealateral = (3 * arestabase * alturaprisma);
		System.out.println("O valor da área lateral é: " + arealateral);
		System.out.println(" ");
	}

	
	public void calcAreaTotal() {
		areaTotal = arealateral + areabase;
		System.out.println("O valor da área é: " + areaTotal);
		System.out.println(" ");
	}
	
	public void calcVolume() {
		volume = areabase * alturaprisma;
		System.out.println("O valor do volume é: " + volume);
		System.out.println(" ");
	}

	
	public void setListaAtributos() {
		System.out.println("Digite o valor da aresta da base: ");
		arestabase = sc.nextDouble();
		System.out.println("O valor da altura do prisma: ");
		alturaprisma = sc.nextDouble();
		System.out.println("  ");
		System.out.println("O valor da aresta da base é: " +arestabase);
		System.out.println("O valor da altura do prisma é: " +alturaprisma);

  
	}
	
	public double getArea() {
		System.out.println("O valor da área é: "+areaTotal );
		return areaTotal;
	}
	
	public double getVolume() {
		System.out.println("O valor do volume é: "+volume);
		return volume;
	}	
	
	
	
	
	
	
	
	
	
	
	
}
