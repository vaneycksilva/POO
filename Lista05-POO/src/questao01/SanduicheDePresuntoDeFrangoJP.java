package questao01;

public class SanduicheDePresuntoDeFrangoJP extends Sanduiche{
	
	public SanduicheDePresuntoDeFrangoJP(){
		
		super.pao = new PaoFrances();
		super.queijo = new QueijoMussarela();
		super.recheio = new RecheioPresuntoDeFrango();
		super.salada = new SaladaComVerdura();
	}
	
	public void preparar() {
		
		System.out.println("Sanduíche de" + super.recheio.getRecheio()+super.pao.getPao()+super.queijo.getQueijo()+super.salada.getSalada());
		
	}


}
