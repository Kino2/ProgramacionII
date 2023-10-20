package TP04.AlarmaSensorial;

import java.util.ArrayList;

public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(ArrayList<Sensor> sensores) {
        super(sensores);
        luz = new Luz();

    }

    public boolean haySensorActivado() {
        for (int i = 0; i < sensores.size(); i++) {
            if (sensores.get(i).getSensorActivado()) {
                return true;
            }
        }
        return false;
    }


    public void comprobar() {
       boolean sensorActivado = haySensorActivado();
        super.comprobar();
        if(sensorActivado){
            luz.encender();
        } else {
            System.out.println("No hay ningun sensor activado");
        }
    }

}