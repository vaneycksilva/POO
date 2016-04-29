package questao04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdaptadorSomaObjectAdapter /*extends SomadorExistente*/ implements SomadorEsperado {

	
	private SomadorExistente somadorExistente;
//	private SomadorEsperado SomadorEsperado;
//	SomadorExistente 
//	private Cliente cliente;
	
	public AdaptadorSomaObjectAdapter() {
		//SomadorEsperado = (SomadorEsperado) soma;
		somadorExistente = somadorExistente;
		//cliente = cliente;
	}
	
	
	@Override
	public int somaVetor(int[] vetor) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		for (int i = 0; i < vetor.length; i++) {
			list.add(vetor[i]);
			
		}
		
	
		
		/*
		Arrays.asList(vetor);
		//int vetor = vetor.length;
		vetor =  new int[List<Integer[]>];
		
		//List<Integer> list11 = Arrays.stream(vetor).boxed().collect(Collectors.toList());
		
		
		//cliente.executar();
		*/
		int somador = somadorExistente.somaLista(list);
	//	somadorExistente.somaLista(cliente.executar());
		return somador;
	}
	
	
	
	
	

}
