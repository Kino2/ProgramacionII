package LogisticaMorgana;

public class FiltroCosto extends Filtro{
    private double porcentaje;

    //Constructor
    public FiltroCosto(double porcentaje){
        this.porcentaje = porcentaje;
    }

    //Metodos
    @Override
    public boolean cumple(ElementoLM elemento){
        return (elemento.getValorAsegurado() * porcentaje) / 100 < elemento.getCostoEnvio();
    }
}