public class CondicionNOT implements Condicion{
    //Atributo
    private Condicion cond;

    //Constructor
    public CondicionNOT(Condicion cond){
        this.cond = cond;
    }

    //Metodos
    @Override
    public boolean cumple(ElementoLN elemento){
        return !cond.cumple(elemento);
    }
}
