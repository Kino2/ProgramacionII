package Electrodomesticos;

public class Main {
    public static void main (String [] args){
        Electrodomestico Heladera = new Electrodomestico("Heladera");
        Electrodomestico Lavadora = new Electrodomestico("Lavadora", "Verde");
        Electrodomestico Televisor = new Electrodomestico("Televisor", 912);
        Electrodomestico Licuadora = new Electrodomestico("Licuadora", "Blanco", 18, 27.12, 60);

        System.out.println("Heladera");
        System.out.println("Es de bajo consumo: " + Heladera.bajoConsumo());
        System.out.println("Balance: " + Heladera.calculoBalance());
        System.out.println("Es de alta gama:  " + Heladera.esAltaGama());
        System.out.println();

        System.out.println("Lavadora");
        System.out.println("Es de bajo consumo: " + Lavadora.bajoConsumo());
        System.out.println("Balance: " + Lavadora.calculoBalance());
        System.out.println("Es de alta gama:  " + Lavadora.esAltaGama());
        System.out.println();

        System.out.println("Televisor");
        System.out.println("Es de bajo consumo: " + Televisor.bajoConsumo());
        System.out.println("Balance: " + Televisor.calculoBalance());
        System.out.println("Es de alta gama:  " + Televisor.esAltaGama());
        System.out.println();
        
        System.out.println("Licuadora");
        System.out.println("Es de bajo consumo: " + Licuadora.bajoConsumo());
        System.out.println("Balance: " + Licuadora.calculoBalance());
        System.out.println("Es de alta gama:  " + Licuadora.esAltaGama());
    }
}
