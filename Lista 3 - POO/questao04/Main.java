package questao04;

public class Main {

	public static void main(String[] args) {

		
		Caractere caractere = new NumeroUm();
		
		caractere = new ParentesesDecorator(caractere);
		caractere = new ChavesDecorator(caractere);
		caractere = new ParentesesDecorator(caractere);
		caractere = new ParentesesDecorator(caractere);
		caractere = new ColchetesDecorator(caractere);
		caractere = new ColchetesDecorator(caractere);
		caractere = new ParentesesDecorator(caractere);
		caractere = new ChavesDecorator(caractere);
		caractere = new ChavesDecorator(caractere);
		
		
		
		System.out.println(caractere.caractere());
		
		
	}

}
