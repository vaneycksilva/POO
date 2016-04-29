package questao03;

public class Padaria {

	public static void main(String[] args) throws MaisDeUmaCoberturaException    {
		// TODO Auto-generated method stub

		///////////////////////////// BOLO DE CHOCOLATE
		
		Bolo boloDeChocolate = new BoloDeChocolate();
		boloDeChocolate = new MorangoCoberturaDecorator(boloDeChocolate);
		boloDeChocolate = new PessegoDecorator(boloDeChocolate);
		boloDeChocolate = new MorangoDecorator(boloDeChocolate);
		

		//////////////////////////// BOLO DE LIMÃO
		
		Bolo boloDeLimao = new BoloDeLimao();
		boloDeLimao = new ChocolateDecorator(boloDeLimao);
		boloDeLimao = new AmoraDecorator(boloDeLimao);
		

		//////////////////////////// BOLO DE LARANJA (SE COLOCAR MAIS DE UMA COBERTURA NÃO ROLA)
	
			try{
			Bolo boloDeLaranja = new BoloDeLaranja();
			boloDeLaranja = new DoceDeLeiteDecorator(boloDeLaranja);
			boloDeLaranja = new PessegoDecorator(boloDeLaranja);
			boloDeLaranja = new MorangoDecorator(boloDeLaranja);
			boloDeLaranja = new AmoraDecorator(boloDeLaranja);
			//boloDeLaranja = new MorangoCoberturaDecorator(boloDeLaranja);
			
			
			System.out.println("Descrição: "+boloDeLaranja.getDescricao());
			System.out.println("Preço: "+boloDeLaranja.getPreco());
			
			}catch(MaisDeUmaCoberturaException e){
				System.out.println(e);
				//e.printStackTrace();
			}
			
		
	
		/////////////////////// IMPRIMI BOLO DE CHOCOLATE
		
		System.out.println("\nDescrição: "+boloDeChocolate.getDescricao());
		System.out.println("Preço: "+boloDeChocolate.getPreco());
		
		
		/////////////////////// IMPRIMI BOLO DE LIMÃO
		
		System.out.println("\nDescrição: "+boloDeLimao.getDescricao());
		System.out.println("Preço: "+ boloDeLimao.getPreco());
		
		
		/////////////////////// IMPRIMI BOLO DE LARANJA
		
		//System.out.println("\nDescrição: "+boloDeLaranja.getDescricao());
		//System.out.println("Preço: "+boloDeLaranja.getPreco());
		
		

	
	}

}
