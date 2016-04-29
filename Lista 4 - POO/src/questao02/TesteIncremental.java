package questao02;

public class TesteIncremental {

	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			
			Incremental inc = Incremental.getInstance();
		//	Incremental inc = new Incremental();
			
			System.out.println(inc);
		}
		
		
	}
	
}
