package questao09;

public class Gerente extends Funcionario {

	

	private String area;
	
	
	public Gerente(String nome,Data data,float salario, String area) {
		super(nome,data,salario);
		this.area = area;
	}
	
	@Override
	public float calculaImposto() {
		float imposto = (float) 0.05;
		return getSalario()*imposto;
	}
	
	@Override
	public String imprimeDados() {
		
		return "\n\n---------GERENTES----------\n\n"+super.toString()+
				"	Área: "+getArea()+
				"\n	Salário: "+getSalario()
				+"\n	Imposto do Gerente: "+this.calculaImposto();
	
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	

}
