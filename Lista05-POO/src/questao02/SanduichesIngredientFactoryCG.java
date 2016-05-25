package questao02;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory{

	@Override
	public Recheio criarRecheio() {
		return new RecheioPresuntoDeFrango();
	}

	@Override
	public Pao criarPao() {
		return new PaoIntegral();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoPrato();
	}

	@Override
	public Salada criarSalada() {
		return new SaladaSemVerdura();
	}

}
