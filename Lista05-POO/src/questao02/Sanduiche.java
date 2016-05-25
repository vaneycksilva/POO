package questao02;

public abstract class Sanduiche {
	
	protected String tipo;
	protected Recheio recheio;
	protected Queijo queijo;
	protected Pao pao;
	protected Salada salada;
	SanduichesIngredientFactory  fabrica;
	
	public abstract void preparar();

}
