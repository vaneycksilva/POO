package questao10;



public class Retangulos extends Quadrilatero {


	private int altura;
	private int base;
	
	
	public Retangulos(int l1,int l2, int l3, int l4, int altura, int base) {
		super(l1, l2, l3, l4);
		this.altura=altura;
		this.base=base;
		
	}
	
	
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return getBase()*getAltura();
	}

	
	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return getLado1()+getLado2()+getLado3()+getLado4();
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}
	
	@Override
	public String toString() {
		
		return "\nRetângulo";
	}

}
