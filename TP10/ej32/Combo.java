import java.time.LocalDate;
import java.util.ArrayList;

public class Combo extends ElementoLN{
    //Atributos
    private double costoEnvio;
    private double valorAsegurado;
    private ArrayList<ElementoLN> paquetes;
    private ArrayList<ElementoLN> paquetesEspeciales;
    private Condicion condicion;
    //Constructor
    public Combo(String destino, LocalDate fechaPartida, Condicion condicion) {
        super(destino, fechaPartida);
        this.paquetes = new ArrayList<>();
        this.paquetesEspeciales = new ArrayList<>();
        this.condicion = condicion;
    }

    //Metodos
    @Override
    public double getValorAsegurado() {
        valorAsegurado = 0.0;
        for(int i = 0; i < paquetes.size(); i++){
            ElementoLN elemHijo = paquetes.get(i);
            valorAsegurado += elemHijo.getValorAsegurado();
        }
        return valorAsegurado;
    }

    public int getCantidad(){
        int cant = 0;
        for (int i = 0; i < paquetes.size(); i++) {
            ElementoLN elemHijo = paquetes.get(i);
            cant += elemHijo.getCantidad();
        }
        return cant;
    }
 
    @Override
    public double getCostoEnvio() {
        costoEnvio = 0.0;
        for(int i = 0; i < paquetes.size(); i++){
            ElementoLN elemHijo = paquetes.get(i);
            costoEnvio += elemHijo.getCostoEnvio();
        }
        return costoEnvio;
    }

    @Override
    public Paquete getMayorPaquete() { 
        Paquete paquete = new Paquete(null, null, 0.0, 0.0);
        for(int i = 0; i < paquetes.size(); i++){
            ElementoLN elemHijo = paquetes.get(i);   
            if(elemHijo.getValorAsegurado() > paquete.getValorAsegurado()){
                paquete = elemHijo.getMayorPaquete();
            }
        }
        return paquete;
    }


    public ArrayList<ElementoLN> getPaquetes() {
        return new ArrayList<>(paquetes);
    }

    public void addPaquete(ElementoLN paquete) {
        if(!this.paquetes.contains(paquete))
            this.paquetes.add(paquete);
    }

    public String toString(){
        String path = "";
        for(int i = 0; i < paquetes.size(); i++){
            ElementoLN elemHijo = paquetes.get(i);
            if(elemHijo == paquetes.get(paquetes.size()-1)){
                path += elemHijo.toString();
            } else{
                path += elemHijo.toString() + "/\n";    
            }
        }
        return "Combo\n" + super.toString() + "(" + this.getCostoEnvio() + ", "
        + this.getValorAsegurado() + ")=\n\n[" + path + "]";
    }

    @Override
    public ArrayList<Paquete> buscar(Condicion condicion) {
        ArrayList<Paquete> resultado = new ArrayList<>();
        for(int i = 0; i < paquetes.size(); i++){
            ElementoLN elemHijo = paquetes.get(i);
            resultado.addAll(elemHijo.buscar(condicion));    
        }
        return resultado;
    }

    public ArrayList<ElementoLN> getPaquetesEspeciales(){
        return new ArrayList<>(paquetesEspeciales);
    }

    public void addPaqueteEspecial(ElementoLN elemento) {
            if(condicion.cumple(elemento)){
                this.paquetesEspeciales.add(elemento);
            }
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }
    
    public double setCostoEnvioPromedio(){
        for(int i = 0; i < paquetesEspeciales.size(); i++){
            ElementoLN elemHijo = paquetesEspeciales.get(i);
            costoEnvio += elemHijo.getCostoEnvio();
        }
        return costoEnvio;
    }

    public Combo copiaBasica() {
        Combo copia = new Combo(this.getDestino(), this.getFechaPartida(),
            this.getCondicion());
        return copia;
    }

    @Override
    public ElementoLN copia() {
        Combo copiaCombo = copiaBasica();
        for(int i = 0; i < paquetes.size(); i++){
            ElementoLN elemHijo = paquetes.get(i);
            ElementoLN copiaHijo = elemHijo.copia();
            if(copiaHijo != null){
                copiaCombo.addPaquete(copiaHijo);
            }
        }
        return copiaCombo;
    }
}