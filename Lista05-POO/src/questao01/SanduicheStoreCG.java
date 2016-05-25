package questao01;

public class SanduicheStoreCG extends SanduicheStore {

	@Override
	public Sanduiche criarSanduiche(String tipo) {
		
		Sanduiche sanduiche = null;
		if ( tipo.equalsIgnoreCase("PresuntoDeFrango")){
			sanduiche = new SanduicheDePresuntoDeFrangoCG();
		}
		return sanduiche;
	
}
}