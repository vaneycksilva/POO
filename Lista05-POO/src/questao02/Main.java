package questao02;

public class Main {

	public static void main(String[] args) {
		
		SanduicheStore sanduicheStore1 = new SanduicheStoreCG();
		SanduicheStore sanduicheStore2 = new SanduicheStoreJP();
		SanduicheStore sanduicheStore3 = new SanduicheStoreRT();
		
		Sanduiche s1=sanduicheStore1.criarSanduiche("PresuntoDeFrango");
		Sanduiche s2=sanduicheStore2.criarSanduiche("PresuntoDeFrango");
		Sanduiche s3 =sanduicheStore3.criarSanduiche("PresuntoDePeru");
		
		System.out.println("Preparando sanduíche em Campina Grande: ");
		s1.preparar();
		System.out.println("\nPreparando sanduíche em João Pessoa: ");
		s2.preparar();
		System.out.println("\nPreparando sanduíche em Rio Tinto: ");
		s3.preparar();
		
		
	}

}
