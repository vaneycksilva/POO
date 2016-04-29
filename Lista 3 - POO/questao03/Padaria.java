package questao03;

public class Padaria {

	public static void main(String[] args) throws MaisDeUmaCoberturaException    {
		// TODO Auto-generated method stub

		///////////////////////////// BOLO DE CHOCOLATE
		
		Bolo boloDeChocolate = new BoloDeChocolate();
		boloDeChocolate = new MorangoCoberturaDecorator(boloDeChocolate);
		boloDeChocolate = new PessegoDecorator(boloDeChocolate);
		boloDeChocolate = new MorangoDecorator(boloDeChocolate);
		

		//////////////////////////// BOLO DE LIM�O
		
		Bolo boloDeLimao = new BoloDeLimao();
		boloDeLimao = new ChocolateDecorator(boloDeLimao);
		boloDeLimao = new AmoraDecorator(boloDeLimao);
		

		//////////////////////////// BOLO DE LARANJA (SE COLOCAR MAIS DE UMA COBERTURA N�O ROLA)
	
			try{
			Bolo boloDeLaranja = new BoloDeLaranja();
			boloDeLaranja = new DoceDeLeiteDecorator(boloDeLaranja);
			boloDeLaranja = new PessegoDecorator(boloDeLaranja);
			boloDeLaranja = new MorangoDecorator(boloDeLaranja);
			boloDeLaranja = new AmoraDecorator(boloDeLaranja);
			//boloDeLaranja = new MorangoCoberturaDecorator(boloDeLaranja);
			
			
			System.out.println("Descri��o: "+boloDeLaranja.getDescricao());
			System.out.println("Pre�o: "+boloDeLaranja.getPreco());
			
			}catch(MaisDeUmaCoberturaException e){
				System.out.println(e);
				//e.printStackTrace();
			}
			
		
	
		/////////////////////// IMPRIMI BOLO DE CHOCOLATE
		
		System.out.println("\nDescri��o: "+boloDeChocolate.getDescricao());
		System.out.println("Pre�o: "+boloDeChocolate.getPreco());
		
		
		/////////////////////// IMPRIMI BOLO DE LIM�O
		
		System.out.println("\nDescri��o: "+boloDeLimao.getDescricao());
		System.out.println("Pre�o: "+ boloDeLimao.getPreco());
		
		
		/////////////////////// IMPRIMI BOLO DE LARANJA
		
		//System.out.println("\nDescri��o: "+boloDeLaranja.getDescricao());
		//System.out.println("Pre�o: "+boloDeLaranja.getPreco());
		
		

	
	}

}
