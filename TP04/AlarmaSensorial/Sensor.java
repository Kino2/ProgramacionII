package TP04.AlarmaSensorial;

public class Sensor {
    private String zona;
    private boolean sensorActivado;

    public Sensor(String zona, boolean sensorActivado) {
        this.zona = zona;
        this.sensorActivado = sensorActivado;
    }

    public void activarSensor() {
        sensorActivado = true;
    }

    public String getZona() {
        return zona;
    }

    public boolean getSensorActivado() {
        return sensorActivado;
    }

}
