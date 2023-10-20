package TP04.Alarma;

public class Alarma {
    protected boolean vidrioRoto;
    protected boolean puertaRota;
    protected boolean ventanaRota;
    protected boolean movSospechoso;
    protected Timbre timbre;

    public Alarma() {
        vidrioRoto = false;
        puertaRota = false;
        ventanaRota = false;
        movSospechoso = false;
        timbre = new Timbre();
    }

    public void romperVidrio(){
        vidrioRoto = true;
    }

    public void romperPuerta(){
        puertaRota = true;
    }

    public void romperVentana (){
        ventanaRota = true;
    }

    public void moverseDentro(){
        movSospechoso = true;
    }

    public void comprobar() {
        if (vidrioRoto || puertaRota || ventanaRota || movSospechoso) {
            timbre.hacerSonar();
        }
    }
}
