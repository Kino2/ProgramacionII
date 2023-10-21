package Dados3;

public class Juego {
	int cantRondas;
	int puntajeMinimo;
	Jugador j1;//int puntos1;
	Jugador j2;//int puntos2;
	Cubilete cubilete;
	
	public Juego(Jugador j1, Jugador j2, int cantRondas, int puntajeMinimo, int cantDados) {
		//puntos1 = 0;
		//puntos2 = 0;
		this.cantRondas = cantRondas;
		this.puntajeMinimo = puntajeMinimo;
		this.j1 = j1;
		this.j2 = j2;
		this.cubilete = new Cubilete(cantDados);
	}
	
	public void jugar() {
		// Desarrollo del juego
		for (int i = 0; i < cantRondas; i++) {
			// Juega el jugador 1
			int r1 = j1.tomarTurno(cubilete);
			int r2 = j2.tomarTurno(cubilete);
			
			if (r1 >= puntajeMinimo && r1 > r2)                 
				j1.incrementarPuntaje();
			else
				if (r2 >= puntajeMinimo && r2 > r1)
					j2.incrementarPuntaje();
		}
		
		// Decidir quien gana
		int puntos1 = j1.getPuntaje();
		int puntos2 = j2.getPuntaje();
		if (puntos1 > puntos2)
			System.out.println("Gano " + j1.getNombre() + " " + puntos1 + " a " + puntos2);
		else
			if (puntos2 > puntos1)
				System.out.println("Gano " + j2.getNombre() + " " + puntos2 + " a " + puntos1);
			else
				System.out.println("Empate");
	}
	
	public static void main(String[] args) {
		
		Jugador j1 = new Jugador("Pepe");
		Jugador j2 = new Jugador("Tito");
		Juego juego1 = new Juego(j1, j2, 10 , 7, 3);
		juego1.jugar();
	}
	
	

}
