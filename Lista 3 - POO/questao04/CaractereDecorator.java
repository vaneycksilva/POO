package questao04;

public abstract class CaractereDecorator implements Caractere{

	protected Caractere caractere;
	
	protected NumeroUm num;
	
	public CaractereDecorator() {
		// TODO Auto-generated constructor stub
		this.caractere = null;
		
		num = new NumeroUm();
	}
	
	
	@Override
	public String caractere() {
		// TODO Auto-generated method stub
		return num.imprimir();
	}




}
