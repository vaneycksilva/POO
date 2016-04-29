package questao01;

public class TestaQuestao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo retangulo = new Retangulo();
		Retangulo retanguloComParametro = new Retangulo(14, 8);
		
		retangulo.setAltura(4);
		retangulo.setLargura(6);
		
	
		
		System.out.println("Área do retângulo: "+retangulo.calculaArea(retangulo.getAltura(), retangulo.getLargura()));
		System.out.println("Perímetro do retângulo: "+retangulo.calculaPerimetro(retangulo.getAltura(), retangulo.getLargura()));
		
		System.out.println(retangulo.toString());

		System.out.println(retangulo.equals(retangulo)+"\n\n");
		
		
		System.out.println("Área do retângulo: "+retanguloComParametro.calculaArea(retanguloComParametro.getAltura(), retanguloComParametro.getLargura()));
		System.out.println("Perímetro do retângulo: "+retanguloComParametro.calculaPerimetro(retanguloComParametro.getAltura(), retanguloComParametro.getLargura()));
		
		System.out.println(retanguloComParametro.toString());

		System.out.println(retangulo.equals(retanguloComParametro));

		
		
	}

}
