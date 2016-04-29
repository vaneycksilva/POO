package questao05;

public class AdaptadorFarenheitParaCelsiusClassAdapter extends MedidorFarenheit implements MedidorCelsiusIF{

	@Override
	public double medirTemperatura() {
		
		return (getTemperaturaFarenheit()-32)/1.8;
	}

}
