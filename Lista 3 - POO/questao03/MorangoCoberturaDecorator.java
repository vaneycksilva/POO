package questao03;

public class MorangoCoberturaDecorator extends CoberturaDecorator{

	
	public MorangoCoberturaDecorator(Bolo bolo) throws MaisDeUmaCoberturaException{
		// TODO Auto-generated constructor stub
		if (jaTemCobertura(bolo)) {
			
			throw new MaisDeUmaCoberturaException();
		}
		//super.bolo = bolo;
		super.bolo = bolo;
		super.decoratorDescricao = "Cobertura de Morango";
		
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return bolo.getDescricao()+" com "+ decoratorDescricao;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return bolo.getPreco()+1;
	}

}
