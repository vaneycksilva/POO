package questao03;

public class AmoraDecorator extends FrutaDecorator {

	
	public AmoraDecorator(Bolo bolo) {
		// TODO Auto-generated constructor stub
		super.bolo = bolo;
		super.decoratorDescricao = "Amora";
	}
	
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return bolo.getDescricao()+" com "+decoratorDescricao;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return bolo.getPreco()+2;
	}

}
