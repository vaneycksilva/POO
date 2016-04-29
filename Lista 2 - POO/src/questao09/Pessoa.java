package questao09;

public abstract class Pessoa {

	private String nome;
	private Data nascimeto;
	
	
	public Pessoa(String nome, Data data){
		this.nome = nome;
		this.nascimeto=data;
		
	}
	
	
	public abstract String imprimeDados();
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Data getNascimeto() {
		return nascimeto;
	}


	public void setNascimeto(Data nascimeto) {
		this.nascimeto = nascimeto;
	}
	
	@Override
	public String toString() {

		
		/*String string = "-------IMPRIMI CADASTRO-------\n\n";
		for (Pessoa pessoa : p) {
			string += "Nome: "+pessoa.getNome()+"\nNascimento: "+
					"\n	Dia: "+ pessoa.getNascimeto().getDia()+"\n"+
					"	Mês: "+ pessoa.getNascimeto().getMes()+"\n"+
					"	Ano: "+ pessoa.getNascimeto().getAno()+"\n\n";
		}
		return string;*/
		
	
		
		return "	Nome: "+getNome()+"\n	Dia: "+getNascimeto().getDia()+"\n"+
							"	Mês: "+getNascimeto().getMes()+"\n"+
							"	Ano: "+getNascimeto().getAno()+"\n";
	}
	
	
}
