package questao01;

public class SanduicheStoreRT  extends SanduicheStore{

	@Override
	public Sanduiche criarSanduiche(String tipo) {
		
		Sanduiche sanduiche = null;
		if ( tipo.equals("PresuntoDePeru")){
			sanduiche = new SanduicheDePresuntoDePeruRT();
		}
		
		return sanduiche;
		
	}
}
