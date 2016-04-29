package questao04;

public class ColchetesDecorator extends CaractereDecorator {

	public ColchetesDecorator(Caractere caractere) {
		// TODO Auto-generated constructor stub
		super.caractere = caractere;
	}
	
	
	@Override
	public String caractere() {
		// TODO Auto-generated method stub
		return "["+caractere.caractere()+"]";
	}
	
}
