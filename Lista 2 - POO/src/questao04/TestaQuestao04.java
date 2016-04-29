package questao04;

public class TestaQuestao04 {

	public static void main(String[] args) {
		
		
	//ArrayDeBits l = new ArrayDeBits(5);	
	//ArrayDeBits l2 = new ArrayDeBits(5);
		
		
		/*
		 * Eu tinha pensado de outro jeito, esse negocio da memória eu pensava
		 * que não podia usar o ArrayList ai fiz assim mesmo...
		 * E não da tempo de fazer até hoje de noite porque estou indo para casa
		 * Foi mal... mas assim ta funcionando.
		 * 
		 */
		
		
		
		int[] array1 = new int[5];
		
		array1[0]=1;
		array1[1]=1;
		array1[2]=1;
		array1[3]=1;
		array1[4]=0;
	
		int[] array2 = new int[5];
		
		array2[0]=1;
		array2[1]=0;
		array2[2]=1;
		array2[3]=1;
		array2[4]=1;
		
		int[] array3 = new int[4];
		
		array3[0]=1;
		array3[1]=1;
		array3[2]=1;
		array3[3]=1;
	
		ArrayDeBits l3 = new ArrayDeBits(5);
		ArrayDeBits l0 = new ArrayDeBits(4);
		
		
		l3.not(array2);
		System.out.println("array antes do NOT: 10111 /depois: "+l3.toString());
		
		
		l3.or(array2, array1);
		System.out.println("Compara com OR: "+l3.toString());
		
		l3.and(array2, array1);
		System.out.println("Compara com AND: "+l3.toString());
		
		System.out.println("Acessando bit do array1: "+l3.acessaBit(4, array1));
		
		
	
	
	}
	
	
}
