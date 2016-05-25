package questao01;

public class SanduicheDePresuntoDePeruRT extends Sanduiche {
	
	public SanduicheDePresuntoDePeruRT(){
		
		super.pao = new PaoBola();
		super.queijo= new QueijoCheddar();
		super.recheio = new RecheioDePresuntoDePeru();
		super.salada = new SaladaSemVerdura();
	}

	@Override
	public void preparar() {
		
		System.out.println("Sanduíche de" + super.recheio.getRecheio()+super.pao.getPao()+super.queijo.getQueijo()+super.salada.getSalada());
		
	}

}
