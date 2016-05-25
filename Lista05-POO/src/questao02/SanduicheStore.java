package questao02;

public abstract class SanduicheStore {
	
	protected SanduichesIngredientFactory sanduicheIngFactory;
	
	public abstract Sanduiche criarSanduiche(String tipo);

}
