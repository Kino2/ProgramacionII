package TP04.AlarmaSensorial;

import java.util.ArrayList;

public class Alarma {
    ArrayList<Sensor> sensores;
    protected Timbre timbre;

    public Alarma(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
        timbre = new Timbre();
    }


    public void comprobar() {
        int sono = 0;
        for(int i = 0; i<sensores.size(); i++){
            if(sensores.get(i).getSensorActivado()){
                if(sono < 1){
                    timbre.hacerSonar();
                    sono++;
                }
                System.out.println("Zona en conflicto: " + sensores.get(i).getZona());
            }
        }
    }
}
