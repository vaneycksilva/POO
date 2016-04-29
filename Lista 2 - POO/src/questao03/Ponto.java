package questao03;

public class Ponto {
	
	private int x;
	private int y;
	
	
	public Ponto(int x, int y){
		
		this.x=x;
		this.y=y;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if (!(obj instanceof Ponto)) {
			return false;
		}
		
		Ponto p = (Ponto)obj;
		return (p.getX()==getX() && p.getY()==getY()?true:false);
		
	}
	
	
	@Override
	public String toString() {
		
		return "Coordenada x: "+getX()+"\n"+
				"Coordenada y: "+getY();
	}

}
