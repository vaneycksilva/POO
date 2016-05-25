package questao01;

public class SanduicheStoreJP extends SanduicheStore{

	@Override
	public Sanduiche criarSanduiche(String tipo) {
		
		Sanduiche sanduiche = null;
		if ( tipo.equalsIgnoreCase("PresuntoDeFrango")){
			sanduiche = new SanduicheDePresuntoDeFrangoJP();
		}
		return sanduiche;
	}
	
}
