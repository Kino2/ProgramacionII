package Dados3;

public class Jugador {
	
	String nombre;
	int puntaje;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.puntaje = 0;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void incrementarPuntaje() {
		this.puntaje++;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public int tomarTurno(Cubilete cubilete) {
		return cubilete.tirar();
	}

}
