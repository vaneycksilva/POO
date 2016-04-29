package questao09;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {


	private ArrayList<Pessoa> pessoa;

	
	public CadastroPessoas() {
		
		pessoa = new ArrayList<Pessoa>(); 
	}
	
	
	public void cadastraPessoa(Pessoa pess){
		pessoa.add(pess);
	}
	
	
	public ArrayList<Pessoa> getP() {
		return pessoa;
	}


	public void setP(ArrayList<Pessoa> p) {
		this.pessoa = p;
	}

	
	public String imprimeCadastro(){
		
		String string = "-------IMPRIMI CADASTRO-------\n\n";
		for (Pessoa pessoa : pessoa) {
			string += pessoa.imprimeDados();
		}
		return string;
		
	}
	
}
