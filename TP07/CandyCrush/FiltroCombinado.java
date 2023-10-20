package CandyCrush;

public class FiltroCombinado extends Filtro {
    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroCombinado(Filtro filtro1, Filtro filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    public boolean cumple(Ficha f){
        return filtro1.cumple(f) && filtro2.cumple(f);
    }
}
