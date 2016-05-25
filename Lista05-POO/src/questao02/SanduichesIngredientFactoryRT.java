package questao02;

public class SanduichesIngredientFactoryRT implements SanduichesIngredientFactory {

	@Override
	public Recheio criarRecheio() {
		return new RecheioDePresuntoDePeru();
		
	}

	@Override
	public Pao criarPao() {
		return new PaoBola();
		
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoCheddar();
		
	}

	@Override
	public Salada criarSalada() {
		return new SaladaSemVerdura();
		
	}

}
