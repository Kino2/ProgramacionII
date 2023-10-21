package Dados3;

public class Dado {
	
	static final int CARAS_POR_DEFECTO = 6;
	int caras;
	
	public Dado(int caras) {
		this.setCaras(caras);
	}
	
	public Dado() {
		this(CARAS_POR_DEFECTO);
	}
	
	private void setCaras(int caras) {
		this.caras = caras;
	}
	
	public int tirar() {
		return (int)(Math.random() * this.caras) + 1;
	}
}
