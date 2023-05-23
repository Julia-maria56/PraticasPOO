package br.edu.figurasgeometricasespaciais;
import java.util.Scanner;

public class Piramide extends FigEspaciais {
		
		Scanner sc = new Scanner(System.in);
		
		private double arestabase;
		private double altura;
		private double areatotal;
		private double apotema;
		private double areaface;
		private double areabase;
		private double volume;
		
		
		public Piramide() {
			arestabase = 0.0;
			areatotal = 0.0;
			apotema = 0.0;
			areaface = 0.0;
			areabase = 0.0;
			volume = 0.0;
			altura = 0.0;
		}
		public void calcAreaLateral() {
			areaface = 4 * (arestabase * apotema / 2);
		}
		
		public void calcAreaBase() {
			areabase = arestabase * arestabase;
		}

		
		
		public void getcalcAreaTotal() {
			areatotal =  areabase * (areaface);	
			System.out.println("O valor da área é: " + areatotal);
			System.out.println(" ");
		}
		 
		public void calcVolume() {
			volume = areabase * altura;
			System.out.println("O valor do volume é: " + volume);
			System.out.println(" ");
		}
		
		public void setListaAtributos() {
			System.out.println("Digite o valor da aresta: ");
			arestabase = sc.nextDouble();
			System.out.println("Digite o valor da altura: ");
			altura = sc.nextDouble();
			System.out.println("Digite o valor da apótema: ");
			apotema = sc.nextDouble();
			System.out.println("O valor da aresta: " +arestabase);
			System.out.println("O valor da altura: " +altura);
			System.out.println("O valor da apótema é: "+apotema);


		}

		
		
	}
	
	
	
	


