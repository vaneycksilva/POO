package questao02;

public class SanduicheStoreRT extends SanduicheStore{
	
	public SanduicheStoreRT(){
		super.sanduicheIngFactory= new SanduichesIngredientFactoryRT();
	}
	
	public Sanduiche criarSanduiche(String tipo){
		Sanduiche sanduiche = null;
		if ( tipo.equalsIgnoreCase("PresuntoDePeru")){
			sanduiche = new SanduicheDePresuntoDePeru(sanduicheIngFactory);
		}
		return sanduiche;
	}

}
