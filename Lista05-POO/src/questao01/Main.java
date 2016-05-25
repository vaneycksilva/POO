package questao01;

public class Main {

	public static void main(String[] args) {
		
		SanduicheStore sanduicheStore1 = new SanduicheStoreRT();
		SanduicheStore sanduicheStore2 = new SanduicheStoreJP();
		SanduicheStore sanduicheStore3 = new SanduicheStoreCG();
		
		Sanduiche s1 = sanduicheStore1.criarSanduiche("PresuntoDePeru");
		Sanduiche s2 = sanduicheStore2.criarSanduiche("PresuntoDeFrango");
		Sanduiche s3 = sanduicheStore3.criarSanduiche("PresuntoDeFrango");
		
		System.out.println("Preparando sanduíche em Rio Tinto: ");
		s1.preparar();
		System.out.println("\nPreparando sanduíche em João Pessoa: ");
		s2.preparar();
		System.out.println("\nPreparando sanduíche em Campina Grande: ");
		s3.preparar();
	}

}
