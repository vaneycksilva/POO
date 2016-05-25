package questao02;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory {

	@Override
	public Recheio criarRecheio() {
		return new RecheioPresuntoDeFrango();
		
	}

	@Override
	public Pao criarPao() {
		return new PaoFrances();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoMussarela();
		
	}

	@Override
	public Salada criarSalada() {
		return new SaladaComVerdura();
		
	}

}
