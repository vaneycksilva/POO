package questao03;

public class MorangoDecorator extends FrutaDecorator{

	
	public MorangoDecorator(Bolo bolo) {
		// TODO Auto-generated constructor stub
		super.bolo=bolo;
		super.decoratorDescricao = "Morango";
	}
	
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		
		return bolo.getDescricao()+" com "+decoratorDescricao;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return bolo.getPreco()+1.50;
	}

}
