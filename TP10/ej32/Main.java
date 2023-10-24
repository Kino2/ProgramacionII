import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Paquete p1 = new Paquete("Guatemala", LocalDate.of(2023, 10, 9), 200.0, 200.0);
        Paquete p2 = new Paquete("Luxemburgo", LocalDate.of(2023, 11, 9), 200.0, 1500.0);
        Paquete p3 = new Paquete("Guatemala", LocalDate.of(2023, 12, 9), 200.0, 900.0);
        Paquete p4 = new Paquete("Guatemala", LocalDate.of(2023, 12, 19), 200.0, 1800.0);
        
        Combo c1 = new Combo("Luxemburgo", LocalDate.of(2023, 12, 9), new CondicionXdestino("Luxemburgo"));
        Combo c2 = new Combo("Luxemburgo", LocalDate.of(2023, 12, 9), new CondicionXdestino("Luxemburgo"));

        c1.addPaquete(c2);
        c1.addPaquete(p1);
        c1.addPaquete(p2);
        c2.addPaquete(p3);
        c2.addPaquete(p4);

        Empresa e1 = new Empresa(2.4);

        e1.addCombo(c1);
        e1.addCombo(c2);

        // System.out.println(e1.getMayorPaquete(c2) 
        // + "\n" + c2.getValorAsegurado() + "\n" + c2.getCantidad()
        // + "\n" + c2.buscar(new CondicionXcostoEnvio(5)));
    
        // c1.addPaqueteEspecial(p1);
        // c2.addPaqueteEspecial(p2);
        // c1.addPaqueteEspecial(p3);
        // c2.addPaqueteEspecial(p4);
        // c2.addPaqueteEspecial(c1);

        e1.addComboPromocion(c1);
        e1.addComboPromocion(c2);

        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();
        // System.out.println(e1.getCombosPromocion());

        System.out.println("Impresión de directorio: \n");
        System.out.println(e1);

        System.out.println();
        System.out.println();
        System.out.println(c1.getMayorPaquete());
    }
}
