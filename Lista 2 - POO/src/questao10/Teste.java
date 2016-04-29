package questao10;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		
		CalculaFormas retangulo1 = new Retangulos(4, 4, 6, 6, 6, 4);
		CalculaFormas retangulo2 = new Retangulos(5, 5, 7, 7, 7, 5);
		
		CalculaFormas quadrado1 = new Quadrados(4);
		CalculaFormas quadrado2 = new Quadrados(5);
		
		CalculaFormas circulo1 = new Circulo(1);
		CalculaFormas circulo2 = new Circulo(4);
		
		ArrayList<CalculaFormas> arrayDeFormas = new ArrayList<CalculaFormas>();
	
		arrayDeFormas.add(retangulo1);
		arrayDeFormas.add(retangulo2);
		arrayDeFormas.add(quadrado1);
		arrayDeFormas.add(quadrado2);
		arrayDeFormas.add(circulo1);
		arrayDeFormas.add(circulo2);
		
		
		
		for (CalculaFormas calculaFormas : arrayDeFormas) {
			
			System.out.println(calculaFormas.toString());
			System.out.println("Área: "+calculaFormas.calculaArea());
			System.out.println("Perímetro: "+calculaFormas.calculaPerimetro());

		}
		
	}

}
