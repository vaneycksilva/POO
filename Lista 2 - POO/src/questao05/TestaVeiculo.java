package questao05;

public class TestaVeiculo {

	public static void main(String[] args) {

		
		VeiculoAbstrato carro = new VeiculoCarro();
		VeiculoAbstrato moto = new VeiculoMoto();
		
		carro.setChassi(123);
		moto.setChassi(3456);
		
		System.out.println("CHASSI: "+carro.getChassi());
		carro.ligar();
		
		System.out.println("\nCHASSI: "+moto.getChassi());
		moto.ligar();
	}

}
