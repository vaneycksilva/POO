package questao09;

//import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class TestaCadastro  {


	public static void main(String[] args) {
		
		CadastroPessoas cadastra = new CadastroPessoas();
		
		Cliente cliente1 = new Cliente("Joao",new Data(12,6,1980),1);
		Cliente cliente2 = new Cliente("Pedro",new Data(22,9,1966),2);	
		Cliente cliente3 = new Cliente("Maria",new Data(27,1,1985),3);
		
		cadastra.cadastraPessoa(cliente1);
		cadastra.cadastraPessoa(cliente2);
		cadastra.cadastraPessoa(cliente3);
		
		
		Funcionario funcionario1 = new Funcionario("Joana", new Data(1,10,1988), 500);
		Funcionario funcionario2 = new Funcionario("Zefa", new Data(11,9,1989), 800);
		Funcionario funcionario3 = new Funcionario("Tereza", new Data(20,8,1990), 1000);
		
		cadastra.cadastraPessoa(funcionario1);
		cadastra.cadastraPessoa(funcionario2);
		cadastra.cadastraPessoa(funcionario3);
		
		
		Gerente gerente1 = new Gerente("Marcos", new Data(6,2,1987), 8000, "T.I");
		Gerente gerente2 = new Gerente("Leonardo", new Data(25,12,1977), 5000, "Suporte");
		Gerente gerente3 = new Gerente("Van Eyck", new Data(6,5,1993), 10000, "Segurança");
		
		
		cadastra.cadastraPessoa(gerente1);
		cadastra.cadastraPessoa(gerente2);
		cadastra.cadastraPessoa(gerente3);
		
	
		System.out.println(cadastra.imprimeCadastro());
		
		
	}

}
