package Dados3;

public class Cubilete {

	Dado[] dados;
	
	public Cubilete(int cantDados) {
		this.dados = new Dado[cantDados];
		for (int i = 0; i < cantDados; i++)
			this.dados[i] = new Dado();
	}
	
	public int tirar() {
		int total = 0;
		for (int i = 0; i < dados.length; i++)
			total += this.dados[i].tirar();
		
		return total;
	}
	
}
