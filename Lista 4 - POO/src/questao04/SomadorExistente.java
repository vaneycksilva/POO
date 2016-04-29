package questao04;

import java.util.List;

public class SomadorExistente {
	
	
	public int somaLista(List<Integer> lista) {
		
		//Object[] vetor = lista.toArray();
		int resultado = 0;
		for (int i : lista) resultado += i;
			return resultado;
	}
}
