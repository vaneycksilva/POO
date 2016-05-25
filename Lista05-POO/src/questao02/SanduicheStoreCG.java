package questao02;

public class SanduicheStoreCG extends SanduicheStore{
	
	public SanduicheStoreCG(){
		super.sanduicheIngFactory = new SanduichesIngredientFactoryCG();
	}

	@Override
	public Sanduiche criarSanduiche(String tipo) {
		Sanduiche sanduiche = null;
		if ( tipo.equalsIgnoreCase("PresuntoDeFrango")){
			sanduiche = new SanduicheDePresuntoDeFrango(sanduicheIngFactory);
		}
		return sanduiche;
	}
	
	

}
