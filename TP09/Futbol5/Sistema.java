package Futbol5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sistema {
    private ArrayList<Socio> socios;

    public Sistema() {
        socios = new ArrayList<>();
    }

    public void addSocio(Socio socio) {
        if (!socios.contains(socio)) {
            socios.add(socio);
        }
    }

    public ArrayList<Socio> buscar(Filtro condicion, Comparator<Socio> comparador) {
        ArrayList<Socio> retorno = new ArrayList<>();
        for (int i = 0; i < socios.size(); i++) {
            Socio socio = socios.get(i);
            if (condicion.cumple(socio)) {
                retorno.add(socio);
            }
        }
        Collections.sort(retorno, comparador);
        return retorno;
    }

    public ArrayList<Socio> sociosCuotaImpaga() {
        FiltroCuotaImpaga filtroCuotaImpaga = new FiltroCuotaImpaga();
        ComparadorApellidoNombre compApellidoNombre = new ComparadorApellidoNombre();
        ArrayList<Socio> sociosCuotaImpaga = this.buscar(filtroCuotaImpaga, compApellidoNombre);
        return sociosCuotaImpaga;
    }

    public ArrayList<Socio> menoresDeEdad() {
        FiltroMenorDeEdad filtroMenor = new FiltroMenorDeEdad();
        ComparadorEdad compEdad = new ComparadorEdad();
        ArrayList<Socio> menoresDeEdad = this.buscar(filtroMenor, compEdad);
        return menoresDeEdad;
    }

    public ArrayList<Socio> sociosConCanchaMasAlquilada() {
        FiltroCancha13 filtroCancha13 = new FiltroCancha13();
        ComparadorCancha compCancha = new ComparadorCancha();
        ArrayList<Socio> sociosCantCancha = this.buscar(filtroCancha13, compCancha);
        return sociosCantCancha;
    }

    public ArrayList<Socio> sociosPagoMasDe500() {
        FiltroPrecioPagador filtroPrecioPagador = new FiltroPrecioPagador();
        FiltroPrecioMoroso filtroPrecioMoroso = new FiltroPrecioMoroso();
        ComparadorApellidoNombre compApellidoNombre = new ComparadorApellidoNombre();
        ArrayList<Socio> sociosPagos = this.buscar(filtroPrecioPagador, compApellidoNombre);
        ArrayList<Socio> sociosMorosos = this.buscar(filtroPrecioMoroso, compApellidoNombre);
        sociosPagos.addAll(sociosMorosos);
        return sociosPagos;
    }
}
