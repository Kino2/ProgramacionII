package TP04.Alarma;

public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(){
        luz = new Luz();
    }

    public void comprobar(){
        super.comprobar();
        if(super.vidrioRoto || super.puertaRota || super.ventanaRota || super.movSospechoso){
            luz.encender();
        }
    }
}
