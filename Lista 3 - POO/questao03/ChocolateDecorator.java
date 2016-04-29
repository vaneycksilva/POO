package questao03;

public class ChocolateDecorator extends CoberturaDecorator{

	
	public ChocolateDecorator(Bolo bolo) throws MaisDeUmaCoberturaException{
		// TODO Auto-generated constructor stub
		if (jaTemCobertura(bolo)) {
				
				throw new MaisDeUmaCoberturaException();
		}
		
		super.bolo = bolo;
		super.decoratorDescricao = "Cobertura de Chocolate";
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return bolo.getDescricao()+ " com " + decoratorDescricao;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return bolo.getPreco()+1;
	}

}
