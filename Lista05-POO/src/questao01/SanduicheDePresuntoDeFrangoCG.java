package questao01;

public class SanduicheDePresuntoDeFrangoCG extends Sanduiche {
	
		public SanduicheDePresuntoDeFrangoCG (){
			super.pao = new PaoIntegral();
			super.queijo = new QueijoPrato();
			super.recheio = new RecheioPresuntoDeFrango();
			super.salada= new SaladaSemVerdura();
		}
		
		public void preparar(){
			
			System.out.println("Sanduíche de" + super.recheio.getRecheio()+super.pao.getPao()+super.queijo.getQueijo()+super.salada.getSalada());
		}
}	
