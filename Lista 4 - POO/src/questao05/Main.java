package questao05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MedidorFarenheit m = new MedidorFarenheit();
		
		AdaptadorFarenheitParaCelsiusClassAdapter ad1 = new AdaptadorFarenheitParaCelsiusClassAdapter();
		AdaptadorFarenheitParaCelsiusObjectAdapter ad2 = new AdaptadorFarenheitParaCelsiusObjectAdapter(m); 
		
		System.out.println("Adaptador Class Adpter: "+ad1.medirTemperatura());
		System.out.println("Adaptador Object Adapter "+ad2.medirTemperatura());
	}

}
