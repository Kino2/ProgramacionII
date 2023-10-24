public class CondicionXdestino implements Condicion{
    //Atributos
    private String destino;

    //Constructor
    public CondicionXdestino(String destino){
        this.destino = destino.toLowerCase();
    }

    //Metodos
    @Override
    public boolean cumple(ElementoLN elemento) {
        return elemento.getDestino().toLowerCase().equals(destino);
    }
    
}
