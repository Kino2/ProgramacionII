package LogisticaMorgana;

public class RestriccionDestinoYFecha extends Restriccion {
    private RestriccionDestino destino;
    private RestriccionFecha fecha;

    public RestriccionDestinoYFecha(){
        destino = new RestriccionDestino();
        fecha = new RestriccionFecha();
    }
    @Override
    public boolean cumple(Combo c, ElementoLM e) {
        return destino.cumple(c, e) && fecha.cumple(c, e);
    }
    
}
