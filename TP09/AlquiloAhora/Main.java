package AlquiloAhora;

public class Main {
    public static void main(String[] args) {
        Inventario herramientas = new Inventario(5000.0, 12, 10, "Herramientas makita");
        Inventario muebles = new Inventario(7500.0, 6, 103, "Muebles de oficina makita");
        Inventario inmueble = new Inventario(15000.0, 24, 103, "Inmueble");

        ElementoDeprecated elemento1 = new ElementoDeprecated(201, herramientas, 13, 0.03);
        ElementoDeprecated elemento2 = new ElementoDeprecated(202, muebles, 6, 0.02);
        ElementoDeprecated elemento3 = new ElementoDeprecated(203, inmueble, 18, 0.05);

        ComboArmado combo = new ComboArmado(104);
        combo.addElemento(herramientas);
        combo.addElemento(muebles);
        combo.addElemento(inmueble);

        Comparador comparador = new Comparador();
        FiltroIdentificacion filtro = new FiltroIdentificacion(103);
        FiltroDescripcion filtro2 = new FiltroDescripcion("MAKITA");
        FiltroAntiguedadYValor filtro3 = new FiltroAntiguedadYValor(13, 16000);
        System.out.println(combo.busqueda(filtro3, comparador));
    }
}
