package questao02;

public class Incremental {
	
	private volatile static Incremental uniqueInstance;
	private static int count = 0;
	private static int numero;
	

		
		private Incremental() {
			numero = ++count;
		}
		
		
		public static Incremental getInstance(){
			
			if (uniqueInstance == null) {
				synchronized(Incremental.class){
					if (uniqueInstance == null) 
					uniqueInstance = new Incremental();
				}
			}
			
			return uniqueInstance;
		}
		
		
		public String toString() {
			return "Incremental " + numero;
		}
		
	
	
}
