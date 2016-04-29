package questao09;

public class Cliente extends Pessoa {


	private int codigo;
	
	
	
	
	public Cliente(){
		
		this("",null,00);
		
	}
	
	public Cliente(String nome, Data data, int c) {
		super(nome,data);
		this.codigo=c;
	}
	
	
	@Override
	public String imprimeDados() {
		
	
		return "\n----------CLIENTE-------\n\n"+super.toString()+"	Código: "+getCodigo()+"\n";
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}
