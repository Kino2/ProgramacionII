package LogisticaMorgana;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RestriccionDestinoYFecha restriccion = new RestriccionDestinoYFecha();
        RestriccionValorAsegurado restriccion2 = new RestriccionValorAsegurado(0);
        Combo combo1 = new Combo("Ciudad A", LocalDate.of(2023, 10, 19), "Combo001", restriccion);
        Combo combo2 = new Combo("Ciudad A", LocalDate.of(2023, 10, 19), "Combo002", restriccion2);
        Combo combo3 = new Combo("Ciudad A", LocalDate.of(2023, 10, 19), "Combo002", restriccion2);

        Paquete paquete1 = new Paquete("Ciudad A", LocalDate.of(2023, 10, 19), 50.0, 2000.0, "Paquete001");
        Paquete paquete2 = new Paquete("Ciudad A", LocalDate.of(2023, 10, 19), 70.0, 3500.0, "Paquete002");
        Paquete paquete3 = new Paquete("Ciudad C", LocalDate.of(2023, 10, 21), 60.0, 1900.0, "Paquete003");
        Paquete paquete4 = new Paquete("Ciudad D", LocalDate.of(2023, 10, 22), 80.0, 1800.0, "Paquete004");
        
        combo1.addElemento(combo2);
        combo1.addElemento(paquete1);
        combo1.addElemento(paquete2);
        combo2.addElemento(paquete3);
        combo2.addElemento(paquete4);

        FiltroDestino filtro = new FiltroDestino("ciudad d");

        Empresa empresa = new Empresa(2);
        System.out.println(combo1.getCostoEnvio());
        empresa.addComboPromocional(combo1);
    }
}
