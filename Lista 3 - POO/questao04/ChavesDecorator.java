package questao04;

public class ChavesDecorator extends CaractereDecorator{

	
	public ChavesDecorator(Caractere caractere) {
		// TODO Auto-generated constructor stub
		super.caractere = caractere;
	}
	
	
	@Override
	public String caractere() {
		// TODO Auto-generated method stub
		return "{"+caractere.caractere()+"}";
	}
	
}
