package SistemaElectoral;

import java.util.ArrayList;

public class Lugar extends ElementoDistrito {
    private String nombre;
    private ArrayList<ElementoDistrito> elementos;

    public Lugar(String nombre) {
        this.nombre = nombre;
        elementos = new ArrayList<>();
    }

    public void addDistrito(ElementoDistrito elemento) {
        if (!elementos.contains(elemento)) {
            elementos.add(elemento);
        } else {
            System.out.println("No se ha podido agregar");
        }
    }

    @Override
    public int recuentoVotosCandidato(Candidato candidato) {
        int recuento = 0;
        for (int i = 0; i < elementos.size(); i++) {
            ElementoDistrito elemHijo = elementos.get(i);
            recuento += elemHijo.recuentoVotosCandidato(candidato);
        }
        return recuento;
    }

    @Override
    public int recuentoVotosEnBlanco() {
        int recuento = 0;
        for (int i = 0; i < elementos.size(); i++) {
            ElementoDistrito elemHijo = elementos.get(i);
            recuento += elemHijo.recuentoVotosEnBlanco();
        }
        return recuento;
    }

    @Override
    public int recuentoVotosEnDetHora() {
        int recuento = 0;
        for (int i = 0; i < elementos.size(); i++) {
            ElementoDistrito elemHijo = elementos.get(i);
            recuento += elemHijo.recuentoVotosEnDetHora();
        }
        return recuento;
    }

    public double porcentajeVotos(Candidato candidato) {
        int votosCandidato = recuentoVotosCandidato(candidato);
        int cantVotos = getVotos();
        return votosCandidato * 100 / cantVotos;
    }

    public double porcentajeVotos() {
        int votosEnBlanco = recuentoVotosEnBlanco();
        int cantVotos = getVotos();
        return votosEnBlanco * 100 / cantVotos;
    }

    public double porcentajeVotosHora() {
        int votosEnHora = recuentoVotosEnDetHora();
        int cantVotos = getVotos();
        return votosEnHora * 100 / cantVotos;
    }

    public int getVotos() {
        int cantVotos = 0;
        for (int i = 0; i < elementos.size(); i++) {
            ElementoDistrito elemHijo = elementos.get(i);
            cantVotos += elemHijo.getVotos();
        }
        return cantVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<ElementoDistrito> getElementos() {
        return elementos;
    }

}
