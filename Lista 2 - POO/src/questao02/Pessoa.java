package questao02;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	private int peso;
	private char sexo;
	
	
	public Pessoa(){
		
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
		
	}
	
	public Pessoa(String nome, int idade, double altura,int peso, char sexo){
		
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
	public double calculaIMC(int peso, double altura){
		
		return peso/(altura*altura);
		
	}
	
	
	public String descricaoIMC(double imc){
		
		if (imc <= 18.5) {
			return "Abaixo do peso normal.";
		} else if (imc > 18.5 && imc <= 25) {
			return "Peso normal.";
		}else if(imc > 25 && imc <=30){
			return "Acima do peso normal.";
		}else
			return "Obesidade.";
		
		
	}
	
	

	@Override
	public String toString() {
		return getNome() + ", sua categoria de acordo com seu IMC é: "+ descricaoIMC(calculaIMC(getPeso(), getAltura()));
	}
	
	
	
	

}
