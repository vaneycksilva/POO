package questao04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomadorEsperado vetor = (SomadorEsperado) new SomadorExistente();// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] somador = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//Cliente cl = new Cliente(vetor);
		//cl.executar();
		
		/*
		 * Eu acho que fiz direito as classes, mas aqui no main
		 * não soube instanciar direito
		 * Na questão não tinha dizendo pra fazer o main, fiz só
		 * pra testar mas deu errado
		 * 
		 * */
		
		AdaptadorSomaObjectAdapter ad = new AdaptadorSomaObjectAdapter();
		ad.somaVetor(somador);
		

	}

}
