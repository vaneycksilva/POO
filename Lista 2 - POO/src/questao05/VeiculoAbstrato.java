package questao05;

public abstract class VeiculoAbstrato implements VeiculoIF {
	
	
	private int chassi;
	
	public VeiculoAbstrato() {
		
		this.chassi = chassi;
	}
	
	
	public abstract void ligar();


	public int getChassi() {
		return chassi;
	}


	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

}
