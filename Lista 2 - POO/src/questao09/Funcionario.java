package questao09;

public class Funcionario extends Pessoa {
	

	private float salario;

	
	public Funcionario(String nome, Data data, float salario) {
		super(nome,data);
		this.salario=salario;
		
	}
	
	@Override
	public String imprimeDados() {
		// TODO Auto-generated method stub
		return "\n-------FUNCIONÁRIOS---------\n\n"+super.toString()+"	Salário: "+getSalario()
							+"\n	Imposto do Funcionário: "+ calculaImposto()+"\n";
		
	}
	

	public float calculaImposto(){
		float imposto = (float) 0.03;
		return getSalario()*imposto;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
