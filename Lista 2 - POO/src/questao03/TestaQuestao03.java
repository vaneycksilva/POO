package questao03;

import java.util.ArrayList;

public class TestaQuestao03 {

	
	static ArrayList<Ponto> array = new ArrayList<Ponto>();
	
	
	public static void main(String[] args) {
	
		
		Ponto p = new Ponto(-3, -2);
		array.add(p);
		
		Ponto p1 = new Ponto(-1, 4);
		array.add(p1);
		
		Ponto p2 = new Ponto(6, 1);
		array.add(p2);
		
		Ponto p3 = new Ponto(3, 10);
		array.add(p3);
		
		Ponto p4 = new Ponto(-4, 9);
		array.add(p4);
		
		/*
		Ponto p5 = new Ponto(-3, -2);
		array.add(p5);
		*/
		
		Poligono poligono = new Poligono(array);
		
		System.out.println("FALSE se os pontos são diferentes ou TRUE se os pontos são iguais: "
				+ ""+p1.equals(p2));
		//false
		
		System.out.println("A área do polígono é: "+poligono.calculaArea());
		//60
		
		
		System.out.println(poligono.toString());
		
		
		System.out.println("Remove Coordenada: "+poligono.removePontos(p));
		
		System.out.println("\nPonto removido:"+poligono.toString());
	}

}
