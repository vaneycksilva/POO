package questao05;

public class VeiculoCarro extends VeiculoAbstrato{


	@Override
	public void ligar() {
		
		System.out.println("Carro de chassi: "+getChassi()+" ligando.");
	}
	
}
