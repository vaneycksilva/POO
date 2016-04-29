package questao04;

public class ParentesesDecorator extends CaractereDecorator {

	public ParentesesDecorator(Caractere caractere) {
		// TODO Auto-generated constructor stub
		super.caractere = caractere;
		//NumeroUm num = new NumeroUm()
	}
	
	@Override
	public String caractere() {
		// TODO Auto-generated method stub
		
		return "("+caractere.caractere()+")";
	}
	
}
