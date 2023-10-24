public class CondicionAND implements Condicion{
    //Atributo
    private Condicion cond1;
    private Condicion cond2;

    //Constructor
    public CondicionAND(Condicion cond1, Condicion cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    //Metodos
    @Override
    public boolean cumple(ElementoLN elemento){
        return cond1.cumple(elemento) && cond2.cumple(elemento);
    }    
}
