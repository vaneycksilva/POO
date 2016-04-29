package questao02;

public class TestaQuestao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa();
		Pessoa p = new Pessoa("João", 36, 1.89, 75, 'm');
		
		pessoa.setNome("Bel");
		pessoa.setPeso(48);
		pessoa.setAltura(1.65);
		
		
		System.out.printf("%s, seu IMC é %.2f" , pessoa.getNome(),(pessoa.calculaIMC(pessoa.getPeso(), pessoa.getAltura())));
		System.out.println("\n"+pessoa.toString());
		
		System.out.println("\n"+"Nome: "+p.getNome());
		System.out.println("Idade: "+p.getIdade());
		System.out.println("Altura: "+p.getAltura());
		System.out.println("Peso: "+p.getPeso());
		System.out.println("Sexo: "+p.getSexo());
		System.out.printf("%s, seu IMC é %.2f" ,p.getNome(), (p.calculaIMC(p.getPeso(), p.getAltura())));
		System.out.println("\n"+p.toString());
	}

}
