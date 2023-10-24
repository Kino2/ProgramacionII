public class CondicionXvalorAsegurado implements Condicion{
    //Atributos
    private double valorAsegurado;

    //Constructor
    public CondicionXvalorAsegurado(double valorAsegurado){
        this.valorAsegurado = valorAsegurado;
    }

    //Metodos
    @Override
    public boolean cumple(ElementoLN elemento) {
        return valorAsegurado < elemento.getValorAsegurado();
    }
    
}
