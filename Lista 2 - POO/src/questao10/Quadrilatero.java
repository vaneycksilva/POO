package questao10;

public abstract class Quadrilatero implements CalculaFormas {
	

	private int lado1, lado2, lado3, lado4;
	
	
	 public Quadrilatero(int l1 , int l2, int l3, int l4) {
		
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
		this.lado4 = l4;
	}
	
	
	/*
	 * Depende do tipo do quadrilatero
	 * Estou considerando que seja um quadrado
	 * 
	 * */
	@Override
	public double calculaPerimetro() {
		
		return getLado1()*4;
	}



	public int getLado1() {
		return lado1;
	}



	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}



	public int getLado2() {
		return lado2;
	}



	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}



	public int getLado3() {
		return lado3;
	}



	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}



	public int getLado4() {
		return lado4;
	}



	public void setLado4(int lado4) {
		this.lado4 = lado4;
	}
	

	

}
