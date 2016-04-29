package questao03;

public abstract class BoloDecorator implements Bolo{

	protected Bolo bolo;
	protected String decoratorDescricao;
	
	
	public BoloDecorator() {
		// TODO Auto-generated constructor stub
		this.bolo = bolo;
		this.decoratorDescricao = " ";
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
