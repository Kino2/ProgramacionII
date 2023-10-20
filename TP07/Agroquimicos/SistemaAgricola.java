package Agroquimicos;

import java.util.ArrayList;

public class SistemaAgricola {
    private String nombre;
    private ArrayList<Producto> productos;
    private ArrayList<Cultivo> cultivos;
    private ArrayList<Enfermedad> enfermedades;

    public SistemaAgricola(String nombre) {
        this.nombre = nombre;
        productos = new ArrayList<>();
        cultivos = new ArrayList<>();
        enfermedades = new ArrayList<>();
    }

    public void addProducto(Producto prod) {
        productos.add(prod);
    }

    public void addCultivo(Cultivo cultivo) {
        cultivos.add(cultivo);
    }

    public void addEnfermedad(Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
    }

    // 1
    public ArrayList<String> getListadoTrataEnfermedad(Enfermedad enfermedad) {
        ArrayList<String> listado = new ArrayList<>();
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto.trataEnfermedad(enfermedad)) {
                listado.add(producto.getNombre());
            }
        }
        return listado;
    }
    
    
    // 2
    public ArrayList<String> getListadoTrataEnfermedadYCultivo(Enfermedad enfermedad, Cultivo cultivo) {
        ArrayList<String> listado = new ArrayList<>();
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if(producto.trataEnfermedad(enfermedad) && cultivo.puedeTratarEnfermedad(producto)){
                listado.add(producto.getNombre());
            }
        }
        return listado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(ArrayList<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

}
