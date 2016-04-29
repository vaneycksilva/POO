package questao03;

public abstract class FrutaDecorator extends BoloDecorator {

	protected Bolo bolo;
	protected String decoratorDescricao;
	
	public FrutaDecorator() {
		// TODO Auto-generated constructor stub
		super.bolo = bolo;
		super.decoratorDescricao = "";
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
