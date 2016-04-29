package questao01;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	
	public Retangulo(){
		
		this.largura = 0.0;
		this.altura = 0.0;	
	}
	
	
	public Retangulo(double largura, double altura){
		
		this.largura = largura;
		this.altura = altura;
		
	}
	
	
	
	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	
	public double calculaPerimetro(double altura, double largura){
		
		return 2*(altura+largura);
	}
	
	
	public double calculaArea(double altura, double largura){
		
		return altura*largura;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		
		return "A altura do Retângulo é: " + getAltura()+ "\n"
				+ "A largura do Retângulo é: "+getLargura();
	}
	
	
	//@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if (!(obj instanceof Retangulo)) {
			return false;
		}else{
			
			Retangulo r = (Retangulo)obj;
			
			// sobreescrever o equals só compara os atributos
			if (r.altura == getAltura() && r.largura == getLargura()) {
				return true;
			}else{
				return false;
			}
			
			
		}
		
	}
	


}
