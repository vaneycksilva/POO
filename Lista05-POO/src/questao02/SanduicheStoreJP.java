package questao02;

public class SanduicheStoreJP extends SanduicheStore{
	
	public SanduicheStoreJP(){
		super.sanduicheIngFactory = new SanduichesIngredientFactoryJP();
	}
	public Sanduiche criarSanduiche(String tipo){
		Sanduiche sanduiche = null;
		if ( tipo.equalsIgnoreCase("PresuntoDeFrango")){
			sanduiche = new SanduicheDePresuntoDeFrango(sanduicheIngFactory);
		}
		return sanduiche;
	}
	
	

}
