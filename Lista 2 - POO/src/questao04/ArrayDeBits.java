package questao04;

public class ArrayDeBits {

	
	private int tamanho;
	private int[] array;
	
	public ArrayDeBits(int tamanho){
		
		this.tamanho=tamanho;
		array=new int[tamanho];
	}

	
	public int acessaBit(int posicao, int[] array){
		
		return array[posicao];
		
	}
	
	
	//PROBLEMA
	public void modificaBit(int anterior, int nova_posicao, int[] array){
		
		array[anterior] = array[nova_posicao];
		adicionaBit(array[nova_posicao],nova_posicao);
	}
	
	
	
	public int[] not(int[] a){
		
		int[] b = new int[getTamanho()];
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0){
				
				adicionaBit(1, i);
			}else{
				
				adicionaBit(0, i);
			}
		}
		return b;
	}
	
	
	public int[] and(int[] a,int[] b){
		
		int[] c = new int[getTamanho()];
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1 && b[i]==1){
				//c[i]=1;
				adicionaBit(1, i);
				
			}else{
				//c[i]=0;
				adicionaBit(0, i);
			}
		}
		return c;
	}
	
	
	
	public int[] or(int[] a,int[] b){
		
		int[] c = new int[getTamanho()];
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0 && b[i]==0){
				//c[i]=1;
				adicionaBit(0, i);
				
			}else{
				//c[i]=0;
				adicionaBit(1, i);
			}
		}
		return c;
	}
	
	
	
	
	public void adicionaBit(int bit,int posicao){
		
		this.array[posicao] = bit;
		
	}
	
	
	@Override
	public String toString() {
		
		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += array[i];
		}
		
		return str;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof ArrayDeBits))
			return false;
		
		else{
			
			ArrayDeBits array = (ArrayDeBits)obj; 
			
			if (array.getArray()==getArray() || (array.getTamanho()==getTamanho())) {
				return true;
			}
			
			return false;
		}
		
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


	public int[] getArray() {
		return array;
	}


	public void setArray(int[] array) {
		this.array = array;
	}
	
	
	
}
