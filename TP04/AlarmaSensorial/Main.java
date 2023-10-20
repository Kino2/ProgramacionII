package TP04.AlarmaSensorial;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<Sensor> sensores = new ArrayList<>();
        Sensor sensor1 = new Sensor("Pieza", false);
        Sensor sensor2 = new Sensor("Comedor", false);
        sensores.add(sensor1);
        sensores.add(sensor2);

        AlarmaLuminosa alarma = new AlarmaLuminosa(sensores);
        alarma.comprobar();
        
    }
}
