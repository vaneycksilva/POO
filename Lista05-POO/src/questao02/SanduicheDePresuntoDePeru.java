package questao02;

public class SanduicheDePresuntoDePeru extends Sanduiche{
	
	public SanduicheDePresuntoDePeru( SanduichesIngredientFactory fabrica){
		
		super.fabrica = fabrica;
		super.pao = fabrica.criarPao();
		super.queijo= fabrica.criarQueijo();
		super.recheio = fabrica.criarRecheio();
		super.salada = fabrica.criarSalada();
		
	}
	
	public void preparar(){
		System.out.println("Sanduíche de" + super.recheio.getRecheio()+super.pao.getPao()+super.queijo.getQueijo()+super.salada.getSalada());

	}


}
