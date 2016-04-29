package questao06;


public class LuzAmbiente extends LigaveisDesligaveisAbstrata {
	private String nivelLuminosidade;
	
	private static String BAIXO = "baixo";  
	private static String MEDIO = "medio";
	private static String ALTO = "alto";
	
	public LuzAmbiente(String descricao) {
		super.descricao = descricao;
		super.status = OFF;
		this.nivelLuminosidade = BAIXO;
	}
  
	public void luminosidadeBaixa() {
		if (status == OFF) {
			System.out.println("luzes desligadas");
		} else {
			this.nivelLuminosidade = BAIXO;
			System.out.println(descricao + " diminuição da luminosidade \n");
		}
	}
   
	public void luminosidadeMedia() {
		if (status == OFF) {
			System.out.println("luzes desligadas");
		} else {
			this.nivelLuminosidade = MEDIO;
			System.out.println(descricao + " luminosidade média\n");
		}
	}
	
	public void luminosidadeAlta() {
		if (status == OFF) {
			System.out.println("luzes desligadas");
		} else {
			this.nivelLuminosidade = ALTO;
			System.out.println("\n"+descricao + " aumento da luminosidade ");
		}
		
	}
}

