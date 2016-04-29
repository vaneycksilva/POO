package questao10;

public class Circulo implements CalculaFormas {

	
	private double raio;
	private final double pi = 3.1415; 
	
	
	
	public Circulo(double raio){
		this.raio=raio;
	}
	
	
	@Override
	public double calculaArea() {
		
		return pi*(getRaio()*getRaio());
	}

	@Override
	public double calculaPerimetro() {
		
		return 2*pi*getRaio();
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(int raio) {
		this.raio = raio;
	}

	
	@Override
	public String toString() {
		
		return "\nCírculo";
	}
	
}
