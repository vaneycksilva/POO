package questao10;

public class Quadrados implements CalculaFormas{

	
	private int tamanho;
	
	
	public Quadrados(int tamanho) {
		
		this.tamanho = tamanho;
	}

	@Override
	public double calculaArea() {
		
		return getTamanho()*getTamanho();
	}

	@Override
	public double calculaPerimetro() {
		int lados = 4;
		return calculaArea()*lados;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	@Override
	public String toString() {
		
		return "\nQuadrado ";
	}

}
