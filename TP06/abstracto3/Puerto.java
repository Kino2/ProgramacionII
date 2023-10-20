package abstracto3;

public class Puerto {
    private ColaEspera barcos;
    private ColaEspera camiones;

    public Puerto() {
        barcos = new ColaEspera();
        camiones = new ColaEspera();
    }

    public void addBarco(Barco barco){
        if(barco == null) return;
        if(camiones.tieneElementos()){
            Camion camion = ((Camion)camiones.getSiguiente());
            barco.cargarBarco(camion);
        } else {
            barcos.addElemento(barco);
        }
    }

    public void addCamion(Camion camion){
        if(camion == null) return;
        if(barcos.tieneElementos()){
            Barco libre = ((Barco) barcos.getSiguiente());
            libre.cargarBarco(camion);
        } else{
            camiones.addElemento(camion);
        }
    }

    public Barco getSiguienteBarco(){
        return (Barco) barcos.getSiguiente();
    }

    public Camion getSiguienteCamion(){
        return (Camion) camiones.getSiguiente();
    }
}
