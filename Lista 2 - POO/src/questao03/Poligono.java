package questao03;

import java.util.ArrayList;
//import java.util.List;

public class Poligono {
	
	
	
	ArrayList<Ponto> p1;//= new ArrayList<Ponto>();
	
	
	public Poligono(ArrayList<Ponto> p) {
		
		setP1(p);;
		
	}
	
	
	public ArrayList<Ponto> getP1() {
		return p1;
	}
	

	public void setP1(ArrayList<Ponto> p1) {
		this.p1 = p1;
	}


	public void addPontos(Ponto p){
		
		if (p.getX()==p.getY()) {
			System.out.println("Um polígono não pode ter pontos repetidos.");
		} else {
			p1.add(p);
		}	
		
	}
	
	
	public Ponto removePontos(Ponto p){
	
		p1.remove(p);
		return p;
	}
	
	
	@Override
	public String toString() {
		
		String res = "";
		
		for (Ponto ponto : p1) {
			res += "\n"+ponto+"\n";
			//System.out.println(ponto);
		//	return res;
		}
		
		return res;
	}
	
	
	/**
	 * NÃO MEIXA, GAMBIARRA
	 * @return
	 */
	public int calculaArea(){
		
		//guarda a penultima posição de X e multiplica com a primeira do Y
		int pegaX=p1.get(p1.size()-1).getX()*(p1.get(0).getY());
		
		//guarda a penultima posição do Y e multiplica com a primeira de X
		int pegaY=p1.get(p1.size()-1).getY()*(p1.get(0).getX());
		
		int somaX=pegaX , somaY=pegaY,total=0;
		for (int i = 0; i < p1.size()-1; i++) {
			somaX += p1.get(i).getX() * (p1.get(i+1).getY());
			somaY += (p1.get(i).getY()) * p1.get(i+1).getX();
			
		}
		
		 if(somaX > somaY) {
			total = (somaX-(somaY))/2;
		} else {
			total = (somaY-somaX)/2;
		}
		
		//retorna ja com o valor absoluto
		return Math.abs(total);
	}

	
	
	
}
