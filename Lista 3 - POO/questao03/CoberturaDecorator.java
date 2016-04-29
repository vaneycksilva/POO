package questao03;

public abstract class CoberturaDecorator extends BoloDecorator {

	protected Bolo bolo;
	protected String decoratorDescricao;
	
	
	
	public CoberturaDecorator() throws MaisDeUmaCoberturaException {
		
		if (jaTemCobertura(bolo)) {
			
			throw new MaisDeUmaCoberturaException();
		}
		super.bolo = bolo;
		
		
	}

	
	protected boolean jaTemCobertura(Bolo bolo){
		
		if (bolo instanceof BoloDecorator) {
			BoloDecorator boloDecorator = (BoloDecorator) bolo;
			
			if (!(bolo instanceof CoberturaDecorator)) {
				return true;
			} else {
				return jaTemCobertura(boloDecorator.bolo);
			}
			
		} else {
			return false;
		}
		
	}
	
	
	public Bolo getBolo() {
		return bolo;
	}

	public void setBolo(Bolo bolo) {
		this.bolo = bolo;
	}

	public String getDecoratorDescricao() {
		return decoratorDescricao;
	}

	public void setDecoratorDescricao(String decoratorDescricao) {
		this.decoratorDescricao = decoratorDescricao;
	}

	
	
}
