import java.util.ArrayList;

public class Empresa{
    //Atributos
    public static final int max = 2;
    private ArrayList<Combo> combos;
    private ArrayList<Combo> combosExpress;
    private ArrayList<Combo> combosPromocion;
    private double oferta;

    //Constructor
    public Empresa(double oferta) {
        this.oferta = oferta;
        this.combos = new ArrayList<>();
        this.combosExpress = new ArrayList<>();
        this.combosPromocion = new ArrayList<>();
    }

    //Metodos
    public ArrayList<Combo> getCombos() {
        return new ArrayList<>(combos);
    }

    public void addCombo(Combo combo) {
        if(combo.getCantidad() >= max && !this.combos.add(combo)){
            this.combos.add(combo);
        }
    }

    public ElementoLN getMayorPaquete(Combo combo) {
        return combo.getMayorPaquete();
    }

    public double getOferta() {
        return oferta;
    }

    public void setOferta(double oferta) {
        this.oferta = oferta;
    }

    public ArrayList<Combo> getCombosEspeciales() {
        return new ArrayList<>(combos);
    }

    public ArrayList<Combo> getCombosExpress() {
        return new ArrayList<>(combosExpress);
    }

    public void addComboExpress(Combo comboExpress) {
        if(comboExpress.getDestino() == "Corea")
            this.combosExpress.add(comboExpress);
    }

    public ArrayList<Combo> getCombosPromocion() {
        return new ArrayList<>(combosPromocion);
    }

    public void addComboPromocion(Combo comboPromocion) {
        comboPromocion.setCostoEnvioPromedio();  
            this.combosPromocion.add(comboPromocion);
    }

    public String toString(){
        int contador = 1;
        String path = "Empresa:" + "\n\n";
        for(int i = 0; i < combos.size(); i++){
            ElementoLN elemHijo = combos.get(i);
            path += "Ejemplo" + (contador++) + "\n(" + elemHijo.toString() + ")\n\n";    
        }
        return path;
    }
    
}
