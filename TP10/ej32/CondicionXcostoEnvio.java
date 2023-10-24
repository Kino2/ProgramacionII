public class CondicionXcostoEnvio implements Condicion{
    //Atributos
    private double porcentaje;

    //Constructor
    public CondicionXcostoEnvio(double porcentaje){
        this.porcentaje = porcentaje;
    }

    //Metodos
    @Override
    public boolean cumple(ElementoLN elemento){
        return (elemento.getValorAsegurado() * porcentaje) / 100 < elemento.getCostoEnvio();
    }
}
